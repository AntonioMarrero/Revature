import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { BehaviorSubject } from 'rxjs';

// Models
import { Reimbursement } from '../models/Reimbursement';
import { User } from '../models/User';

// Components
import { NavComponent } from '../components/nav/nav.component';

// Services
import { UserService } from './user.service';

const API_URL = environment.apiUrl;
const HTTP_OPTIONS = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable()
export class ReimbursementService {

  subscribers: BehaviorSubject<Reimbursement> = new BehaviorSubject<Reimbursement>(null);
  allsubscribers: BehaviorSubject<Array<Reimbursement>> = new BehaviorSubject<Array<Reimbursement>>(null);
  reimb: Reimbursement  = new Reimbursement();
  user: User = new User();
  date: Date = new Date();
  loggedIn: BehaviorSubject<boolean> = new BehaviorSubject<boolean>((localStorage.getItem('user') !== null) ? true : false);
  loggedUser = JSON.parse(localStorage.getItem('user'));

  id = this.loggedUser.userId; // dummy id to get userId and use it as authorId.
  reimb_author: Reimbursement = this.id;
  statusId = '';
  author = this.reimb_author;
  reimb_status_id = this.statusId;
  
  
  
  
  constructor(private http: HttpClient, userService: UserService) {
    const usr = localStorage.getItem("user");
    if (usr !== "{}" && usr !== "undefined")
       this.subscribers.next(JSON.parse(usr));
      
   }

  getUserReimb() {
    this.id;
    let json = JSON.stringify(this.id);
    console.log("hello " + this.id);
    return this.http.post<Array<Reimbursement>>(API_URL + 'viewreimbursement', json, HTTP_OPTIONS); 
  }

  getAllUserReimb() {
    let json = JSON.stringify(this.id);
    return this.http.post<Array<Reimbursement>>(API_URL + 'viewallreimbursements', json, HTTP_OPTIONS); 
    
  }

  public addReimbursement(reimb: Reimbursement){
    reimb.statusId = 1;
    reimb.author = this.id;    
    const json = JSON.stringify(reimb);
    return this.http.post<Reimbursement>(API_URL + 'addreimbursement', json, HTTP_OPTIONS);
  }

  public updateReimbursement(reimb: Reimbursement){
    reimb.resolved = this.date;
    reimb.author = this.id;    
    const json = JSON.stringify(reimb);
    return this.http.post<Reimbursement>(API_URL + 'updatereimbursements', json, HTTP_OPTIONS);
  }
}
