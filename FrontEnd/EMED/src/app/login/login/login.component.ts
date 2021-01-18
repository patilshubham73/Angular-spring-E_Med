import { SignupService } from './../../signup/signup.service';
import { LoginService } from './../login.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import {NgForm} from '@angular/forms'
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  

user = new User();
mesg='';


  constructor(
    private toaster :ToastrService,
    private service:LoginService,
    private router:Router

    ) { }

  ngOnInit(): void {
  }
  
  // loginbtn(){
  //             this.service.loginUser(this.user)
  //             .subscribe(
  //               data => {
  //                 this.toaster.success('login Successfully')
  //                 console.log('response received');
  //                 this.router.navigate(['/doctorlist'])
  //               },
  //               error => {
  //                     console.log('exeption occured')
  //                     this.toaster.error('some error')
  //                     this.mesg="Bad Request ,please Enter Valid Email and Password"
  //                 }
  //             )
           
  // }

  loginbtn(){
    this.service.loginUser(this.user)
    .subscribe( users =>{
        if(users){
          this.toaster.success('login Successfully')
          console.log('response received');
          this.router.navigate(['/doctorlist'])
        }else {
          this.toaster.warning('please check email and password')
            return false
           

        }
    }

    )
 
} 



  connectbtn(){


  }
}
