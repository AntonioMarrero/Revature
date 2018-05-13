import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { Router } from '@angular/router';
import { UserService } from '../../services/user.service';
import { User } from '../../models/User';
import { Reimbursement } from '../../models/Reimbursement';
import { ReimbursementService } from '../../services/reimbursement.service';

@Component({
  selector: 'app-addreimbursement',
  templateUrl: './addreimbursement.component.html',
  styleUrls: ['./addreimbursement.component.css']
})
export class AddreimbursementComponent implements OnInit {

  reimb: Reimbursement = new Reimbursement();
  user: User = new User();
  loggedUser = JSON.parse(localStorage.getItem('user'));
  tickets = JSON.parse(localStorage.getItem('tickets'));
  isValid = true;

  constructor(
    private reimbursementService: ReimbursementService,
    private location: Location,
    private userService: UserService,
    private router: Router,
  ) { }

  ngOnInit() {
    if (this.loggedUser != null) {
      this.userService.subscribers.next(JSON.parse(localStorage.getItem('user')));
    }
  }

  goBack() {
    this.location.back();
  }

  addReimb() {
    this.reimbursementService.addReimbursement(this.reimb).subscribe(reim => {
      if(reim == null){
        this.isValid = !this.isValid;
      } else {
        this.reimbursementService.subscribers.next(reim);
        this.router.navigate(['viewreimbursement']);
      }
    })
  }
}
