import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ProfileComponent } from './components/profile/profile.component';
import { FormComponent } from './components/form/form.component';
import { LoginComponent } from './components/login/login.component';
import { ParentComponent } from './components/parent/parent.component';
import { Child1Component } from './components/parent/child1/child1.component';
import { Child2Component } from './components/parent/child2/child2.component';


export const routes: Routes = [
{
    path: 'home',
    component: HomeComponent
},
{
    path: 'profile',
    component: ProfileComponent
},
{
    path: 'form',
    component: FormComponent
},
{
    path: 'login',
    component: LoginComponent
},
{
    path: 'parent',
    component: ParentComponent,
    children: [
        {
            path: 'child1',
            component: Child1Component
          },
          {
              path: 'child2',
              component: Child2Component
          }

    ]
},
{
    path: '**',
    redirectTo: '/home',
    pathMatch: 'full'
}
];



