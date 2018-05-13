import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { Router } from '@angular/router';
import { UserService } from '../../services/user.service';
import { ReimbursementService } from '../../services/reimbursement.service';
import { User } from '../../models/User';
import { Reimbursement } from '../../models/Reimbursement';
import { BehaviorSubject } from 'rxjs';

@Component({
  selector: 'app-viewreimbursement',
  templateUrl: './viewreimbursement.component.html',
  styleUrls: ['./viewreimbursement.component.css']
})
export class ViewreimbursementComponent implements OnInit {

  
  reimburs: Array<Reimbursement> = new Array<Reimbursement>();
  user: User = new User();
  reimb: Reimbursement = new Reimbursement();
  loggedUser = JSON.parse(localStorage.getItem('user'));
  isValid = true;
  
  
  

  constructor(
    private reimbursementService: ReimbursementService,
    private location: Location,
    private userService: UserService,
    private router: Router,
    
  ) { }

  goBack() {
    this.location.back();
  }

  ngOnInit() {
    if(this.loggedUser == null ){
      this.router.navigate(['login']);
    } else {
      this.displayReimb();
    }
  }

  displayReimb(){
    this.reimbursementService.getUserReimb().subscribe(t => {
      const json = JSON.stringify(t);
      if(t == null) {
        this.isValid = !this.isValid;
      } else {
        this.reimbursementService.allsubscribers.next(t);
        this.reimburs = JSON.parse(json);
        localStorage.setItem('reimburs', JSON.stringify(t));
      }
    })
  }

 

}
