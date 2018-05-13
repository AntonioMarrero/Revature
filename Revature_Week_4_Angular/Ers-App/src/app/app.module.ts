// Modules
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

// Routing
import { AppRoutingModule } from './app-routing.module';

// Components
import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { LandingComponent } from './components/landing/landing.component';
import { LoginComponent } from './components/login/login.component';
import { NavComponent } from './components/nav/nav.component';
import { RegisterComponent } from './components/register/register.component';
import { ViewreimbursementComponent } from './components/viewreimbursement/viewreimbursement.component';
import { AddreimbursementComponent } from './components/addreimbursement/addreimbursement.component';
import { AdmindashboardComponent } from './components/admindashboard/admindashboard.component';
import { ViewallreimbursementsComponent } from './components/viewallreimbursements/viewallreimbursements.component';

// Services
import { UserService } from './services/user.service';
import { ReimbursementService } from './services/reimbursement.service';



@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    LandingComponent,
    LoginComponent,
    NavComponent,
    RegisterComponent,
    ViewreimbursementComponent,
    AddreimbursementComponent,
    AdmindashboardComponent,
    ViewallreimbursementsComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule.forRoot(),
    
  ],
  providers: [ UserService, ReimbursementService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
