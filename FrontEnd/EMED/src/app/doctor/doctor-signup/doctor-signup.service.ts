import { environment } from './../../../environments/environment';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DoctorSignupService {

  url:any
  // private url='http://localhost:8080/emed'

  constructor(
     private http:HttpClient
  ) {
      this.url=environment.apiUrl
   }
  


    //saving data into db
    registerdoctor(name :string,email:string,mobile:string,address:string,password:string,
      fees:number,specialities:string,education:string

      
      ){
      const body={
        name:name,
        email:email,
        mobile:mobile,
        address:address,
        password:password,
        fees:fees,
        specialities:specialities,
        education:education,
        
      }

     // return JSON.stringify(this.url+"/save-doctor",body)
      return this.http.post(this.url+"/save-doctor",body)
      // return JSON.stringify(response.data)
  }

}
