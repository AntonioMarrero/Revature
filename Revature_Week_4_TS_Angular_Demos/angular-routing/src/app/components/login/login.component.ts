import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  credentials = {
    username: '',
    password: ''
  };

  alert = '';

  constructor(private router: Router) { }

  ngOnInit() {
  }

  submit() {
    console.log('attempting to login');
    if (this.credentials.username === 'tony'
    && this.credentials.password === 'pass') {
      console.log('logged in');
      this.router.navigateByUrl('/home'); // upon successful login navigate to home page
    } else {
      console.log('Invalid loging');
      this.alert = 'Invalid Login';
    }
  }

}
