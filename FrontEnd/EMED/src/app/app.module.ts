import { SignupService } from './signup/signup.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './signup/signup/signup.component';
import { LoginComponent } from './login/login/login.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { HttpClient } from 'selenium-webdriver/http';
import { HomeComponent } from './home/home/home.component';
import { DoctorListComponent } from './doctor/doctor-list/doctor-list.component';
import { UserComponent } from './user/user.component';
import { DoctorSignupComponent } from './doctor/doctor-signup/doctor-signup.component';
import { DoctorSigninComponent } from './doctor/doctor-signin/doctor-signin.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { ToastrModule } from 'ngx-toastr';


@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    LoginComponent,
    HomeComponent,
    DoctorListComponent,
    UserComponent,
    DoctorSignupComponent,
    DoctorSigninComponent,
    // ToastrModule added
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule, // required animations module
    ToastrModule.forRoot()  

  ],
  providers: [SignupService],
  bootstrap: [AppComponent]
})
export class AppModule { }
