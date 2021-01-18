import { Observable } from 'rxjs';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {DoctorListService} from './doctor-list.service';
import { Doctor } from '../doctor';

@Component({
  selector: 'app-doctor-list',
  templateUrl: './doctor-list.component.html',
  styleUrls: ['./doctor-list.component.css']
})
export class DoctorListComponent implements OnInit {
  
  
  doctors:Observable<Doctor[]>;
  
  specialities=[

    {id:1,title:"abc"},
    {id:2,title:"pqr"},
    {id:3,title:"xy"}
  ]
 

  constructor(private service : DoctorListService,private router:Router) {
      
  
   }

  ngOnInit(): void {
    this.fetchDoctorList();
    
  }

  fetchDoctorList(){
    this.doctors=this.service.getAllDoctors();
  }

  filterDoctors(){
    console.log(`id =${this.specialities}`)
  }

  onBookAppointment(doctor){

      alert("Your Appointment Book SuccessFully")
  } 


  
}
