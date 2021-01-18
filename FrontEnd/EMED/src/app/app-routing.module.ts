import { DoctorSignupComponent } from './doctor/doctor-signup/doctor-signup.component';
import { DoctorSigninComponent } from './doctor/doctor-signin/doctor-signin.component';
import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SignupComponent } from './signup/signup/signup.component';
import { LoginComponent } from './login/login/login.component';
import { DoctorListComponent } from './doctor/doctor-list/doctor-list.component';
import { HomeComponent } from './home/home/home.component';

const routes: Routes = [
  { path: 'signup', component: SignupComponent },
  { path: 'login', component: LoginComponent },
  { path: 'doctorlist', component: DoctorListComponent },
  { path: 'home', component: HomeComponent },
  {path:'doctor-signup',component:DoctorSignupComponent},
  {path:'doctor-signin',component:DoctorSigninComponent},
   {path:'' ,redirectTo:'/home', pathMatch : 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
