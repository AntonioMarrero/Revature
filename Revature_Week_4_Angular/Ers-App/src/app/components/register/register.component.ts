import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { User } from '../../models/User';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user: User = new User();
  loggedUser = localStorage.getItem('user');
  
  isValid: boolean = true;

  constructor(
    private userService: UserService,
    private router: Router
  ) { }

  ngOnInit() {
    if (this.loggedUser != null) {
      this.userService.subscribers.next(JSON.parse(localStorage.getItem('user')));
      this.router.navigate(['dashboard']);
    }
  }

  register() {
    this.userService.register(this.user).subscribe(users => {
      if (users == null) {
        this.isValid = !this.isValid;
      } else {
        this.userService.subscribers.next(users);
        this.userService.loggedIn.next(true);
        localStorage.setItem("user", JSON.stringify(users));
        console.log(`User, ${this.user.userName}, successfully registered!`);
        console.log(localStorage.getItem("user"));
        this.router.navigate(['dashboard']);
      }
    });
  }
}