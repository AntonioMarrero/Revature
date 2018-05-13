// Angular Modules
import { NgModule } from '@angular/core';
import { RouterModule, Routes} from '@angular/router';

// Components
import { LandingComponent } from './components/landing/landing.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { RegisterComponent } from './components/register/register.component';
import { ViewreimbursementComponent } from './components/viewreimbursement/viewreimbursement.component';
import { AddreimbursementComponent } from './components/addreimbursement/addreimbursement.component';
import { AdmindashboardComponent } from './components/admindashboard/admindashboard.component';
import { ViewallreimbursementsComponent } from './components/viewallreimbursements/viewallreimbursements.component';


export const routes: Routes = [
    { path: '', redirectTo: 'landing', pathMatch: 'full' },
    { path: 'landing', component: LandingComponent },
    { path: 'login', component: LoginComponent },
    { path: 'dashboard', component: DashboardComponent },
    { path: 'register', component: RegisterComponent },
    { path: 'viewreimbursement', component: ViewreimbursementComponent },
    { path: 'addreimbursement', component: AddreimbursementComponent },
    { path: 'admindashboard', component: AdmindashboardComponent },
    { path: 'viewallreimbursements', component:ViewallreimbursementsComponent }
];

@NgModule({
    imports: [ RouterModule.forRoot(routes) ],
    exports: [ RouterModule ]
})

export class AppRoutingModule { }
