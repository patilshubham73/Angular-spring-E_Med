import { environment } from './../../environments/environment';

import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../login/user';


@Injectable({
  providedIn: 'root'
})
export class SignupService {

  url:any
  // private url='http://localhost:8080/emed'

  constructor(
     private http:HttpClient
  ) {
      this.url=environment.apiUrl
   }
  



  //saving data into db
  registerUser(user :User) :Observable<any>{
      
      return this.http.post<any>(this.url+"/save-user",user)
      
      
  }

}
