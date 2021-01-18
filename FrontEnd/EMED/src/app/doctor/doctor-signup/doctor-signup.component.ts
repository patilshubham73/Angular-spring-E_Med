import { DoctorSignupService } from './doctor-signup.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-doctor-signup',
  templateUrl: './doctor-signup.component.html',
  styleUrls: ['./doctor-signup.component.css']
})
export class DoctorSignupComponent implements OnInit {

  name =''
  email=''
  mobile=''
  address=''
  password =''
  fees =0
  specialities =''
  education =''
  

  constructor(
    private toaster : ToastrService,
    private service:DoctorSignupService,
    private router:Router
    ) { }


  ngOnInit(): void {
  }

  doctorsignupbtn(){
        if(this.name.length ==0){
            this.toaster.warning('please Enter name')
        }else if(this.email.length ==0){
          this.toaster.warning('please Enter Email')
        } else if(this.mobile.length ==0){
          this.toaster.warning('please Enter Mobile')
        }else if(this.address.length ==0){
          this.toaster.warning('please Enter address')
        }else if(this.password.length ==0){
          this.toaster.warning('please Enter password')
        }else if(this.fees < 0 ){
          this.toaster.warning('please Valid  fees')
        }else if(this.specialities.length ==0){
          this.toaster.warning('please Enter specialities ')
        }else if(this.education.length ==0){
          this.toaster.warning('please Enter education')
        }else {
          this.service.registerdoctor(this.name,this.email,this.mobile,this.address,this.password,
            this.fees,this.specialities,this.education)
            .subscribe(users =>{
                    if(users){
                          this.toaster.success('succesfully signed up new account')
                          this.router.navigate(['/doctor-signin'])
                      }  else{
                          this.toaster.error('Error')
                          return false
                    }
            })
        }

      }


    

    
 
  }


 



