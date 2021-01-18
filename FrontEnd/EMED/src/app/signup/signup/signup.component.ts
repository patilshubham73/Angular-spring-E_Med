import { SignupService } from './../signup.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { User } from 'src/app/login/user';
import { isNull } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  user =new User();
  msg='';

  constructor(
    private toaster :ToastrService,
    private service:SignupService,
    private router:Router
    
    ) { }

  ngOnInit(): void {

  }

  signupbtn(){

          this.service.registerUser(this.user)
          .subscribe(users =>{
            console.log(this.user.name);
              if(users){
                  console.log('testing registerusrs in below data found or not')
                  console.log(users)

                  this.toaster.success('successful')
                  this.router.navigate(['/login'])
              }else {
                this.toaster.warning('error')
                return false
                

              }
          })
    }


      
  
   
 

  cancelbtn(){
    this.router.navigate(['/home'])
  }


}