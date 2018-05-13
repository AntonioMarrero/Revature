import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../../models/User';
import { Reimbursement } from '../../models/Reimbursement';
import { UserService } from '../../services/user.service';
import { ReimbursementService } from 
'../../services/reimbursement.service';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  
  // reimb: Reimbursement = new Reimbursement();
  user: User = new User();
  loggedUser = JSON.parse(localStorage.getItem('user'));
  nm = this.loggedUser.firstName;
  id = this.loggedUser.userId;
    

  constructor(
    private reimbursementService: ReimbursementService,
    private userService: UserService,
    private router: Router,
  ) { }

  ngOnInit() {
    if (this.loggedUser == null) {
      this.router.navigate(['login']);
    } else {
      this.userService.subscribers.next(JSON.parse(localStorage.getItem('user')));
      console.log(`User, ${this.loggedUser.firstName}, using dashboard!`); 
      console.log(`User, ${this.loggedUser.userRoleId}, using dashboard!`);
      console.log(`User, ${this.loggedUser.userId}, using dashboard!`);
      console.log(`User, ${this.nm}, using using nm variable`);
      console.log(`User, ${this.id}, using id variable`);
      
     

      if(this.loggedUser.userRoleId == 2){
        console.log(`User, ${this.loggedUser.userRoleId}, using dashboard!`);
        this.router.navigate(['admindashboard']);
      }
  
    }
  }

  viewreimb(id) {
    
    this.router.navigate(['viewreimbursement']);
  }

  addreimb() {
    this.router.navigate(['addreimbursement']);
  }

}
