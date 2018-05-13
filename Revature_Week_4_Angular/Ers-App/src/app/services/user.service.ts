// Modules
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { BehaviorSubject } from 'rxjs';

// Model
import { User } from '../models/User';

// Components
import { NavComponent } from '../components/nav/nav.component';


const API_URL = environment.apiUrl;
const HTTP_OPTIONS = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable()
export class UserService {

  subscribers: BehaviorSubject<User> = new BehaviorSubject<User>(null);
  loggedIn: BehaviorSubject<boolean> = new BehaviorSubject<boolean>((localStorage.getItem('user') !== null) ? true : false);
  admin: BehaviorSubject<User> = new BehaviorSubject<User>(JSON.parse(localStorage.getItem('user')));
  user: User = new User();

  constructor(private http: HttpClient) {
    const usr = localStorage.getItem("user");
    if (usr !== "{}" && usr !== "undefined")  this.subscribers.next(JSON.parse(usr)); 
   }

   public loginUser(user: User) {
    console.log(`Attempting to login user: ${user.userName}`);
    let json = JSON.stringify(user);
    return this.http.post<User>(API_URL + 'login', json, HTTP_OPTIONS);
  }

  public register(user: User) {
    console.log(`Attempting to make a new user: ${user.userName}`);
    let json = JSON.stringify(user);
    return this.http.post<User>(API_URL + 'register', json, HTTP_OPTIONS);
  }

  public getLoggedIn() {
    console.log(this.loggedIn);
    return this.loggedIn;
  }

  public getAdmin() {
    return this.admin;
  }
}
