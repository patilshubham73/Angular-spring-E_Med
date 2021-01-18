import { environment } from './../../../environments/environment';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class DoctorListService {

    
  url:any
  // private url='http://localhost:8080/emed'

  constructor(
     private http:HttpClient
  ) {
      this.url=environment.apiUrl
   }
  

  

  getAllDoctors():Observable<any>{
    return this.http.get(this.url+'/getalldoctors')
  }

}




