import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import {DoctorSigninService} from './doctor-signin.service'
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-doctor-signin',
  templateUrl: './doctor-signin.component.html',
  styleUrls: ['./doctor-signin.component.css']
})
export class DoctorSigninComponent implements OnInit {

  email=''
  password=''

  constructor(
    private toaster:ToastrService,
    private service:DoctorSigninService,
    private router:Router
  ) { }

  ngOnInit(): void {
  }

  doctorloginbtn(){
       if(this.email.length == 0){
         this.toaster.warning('Please Enter Email ')
       } else if(this.password.length == 0){
          this.toaster.warning('Please Enter Password')
       } else {

        this.service.signin(this.email,this.password)
        .subscribe(users =>{
              if(users){
                  this.toaster.success('You are Registered Successfully')
                  this.router.navigate(['/doctorlist'])
                  
              }else {
                  this.toaster.warning('error')
                  return false
              }
        })


       } 


      

  }
  
}
