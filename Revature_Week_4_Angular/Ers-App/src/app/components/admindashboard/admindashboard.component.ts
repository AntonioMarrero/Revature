import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../../models/User';
import { Reimbursement } from '../../models/Reimbursement';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent implements OnInit {

  reimb: Reimbursement = new Reimbursement();
  user: User = new User();
  loggedUser = JSON.parse(localStorage.getItem('user'));

  constructor(
    private userService: UserService,
    private router: Router,
  ) { }

  ngOnInit() { 

    if (this.loggedUser == null) {
      this.router.navigate(['login']);
    } else {
      this.userService.subscribers.next(JSON.parse(localStorage.getItem('user')));
      console.log(`User, ${this.loggedUser.userName}, using dashboard!`); 
      console.log(`User, ${this.loggedUser.userId}, using dashboard!`);
    }
    
  }

  viewallreimb() {
    this.router.navigate(['viewallreimbursements']);
  }
}
