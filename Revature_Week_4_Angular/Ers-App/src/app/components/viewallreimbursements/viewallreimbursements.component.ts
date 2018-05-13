import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { Router } from '@angular/router';
import { UserService } from '../../services/user.service';
import { ReimbursementService } from '../../services/reimbursement.service';
import { User } from '../../models/User';
import { Reimbursement } from '../../models/Reimbursement';
import { BehaviorSubject } from 'rxjs';


@Component({
  selector: 'app-viewallreimbursements',
  templateUrl: './viewallreimbursements.component.html',
  styleUrls: ['./viewallreimbursements.component.css']
})
export class ViewallreimbursementsComponent implements OnInit {

  
  allreimburs: Array<Reimbursement> = new Array<Reimbursement>();
  user: User = new User();
  reimb: Reimbursement = new Reimbursement();
  loggedUser = JSON.parse(localStorage.getItem('user'));
  isValid = true;
  // alltickets = JSON.parse(localStorage.getItem('alltickets'));

  constructor(
    private reimbursementService: ReimbursementService,
    private location: Location,
    private userService: UserService,
    private router: Router,
  ) { }

  ngOnInit() {
    if(this.loggedUser == null ){
      this.router.navigate(['login']);
    } else {
    this.displayallReimb();
    }
  }

  goBack() {
    this.location.back();
  }

  displayallReimb() {
    this.reimbursementService.getAllUserReimb().subscribe(t => {
      const json = JSON.stringify(t);
      if(t == null){
        this.isValid = !this.isValid;
      } else {
        this.reimbursementService.allsubscribers.next(t);
        this.allreimburs = JSON.parse(json);
      localStorage.setItem("allreimburs",JSON.stringify(t));
      }
    });
  }

  approveReimb(reimb: Reimbursement){
    reimb.statusId = 2;

    this.reimbursementService.updateReimbursement(reimb).subscribe(reim => {
      this.reimbursementService.subscribers.next(reim);
    })
    this.router.navigate(['viewallreimbursements'])
  }

  denyReimb(reimb: Reimbursement){
    reimb.statusId = 3;
    this.reimbursementService.updateReimbursement(reimb).subscribe(reim => {
        this.reimbursementService.subscribers.next(reim);
    });
  }

}
