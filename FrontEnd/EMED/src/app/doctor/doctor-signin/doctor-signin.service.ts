import { environment } from './../../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DoctorSigninService {

    
url:any
  // private url='http://localhost:8080/emed'

  constructor(
     private http:HttpClient
  ) {
      this.url=environment.apiUrl
   }


  signin(email:string,password:string){
      const body={
        email:email,
        password:password
      }

      return this.http.post(this.url+"/doctorlogin",body)
  }  


}
