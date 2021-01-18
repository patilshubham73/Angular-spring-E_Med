import { environment } from './../../environments/environment';

import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  

  url:any
  

  constructor(
     private http:HttpClient
  ) {

      this.url=environment.apiUrl
   }
  



    //log in user
    public loginUser(user :User):Observable<any>{
      console.log("in loginUser() service")
      return this.http.post<any>(this.url+'/login',user )
    }

} 



