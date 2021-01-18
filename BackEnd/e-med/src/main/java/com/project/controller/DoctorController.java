package com.project.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.pojos.Doctor;
import com.project.pojos.User;
import com.project.service.DoctorService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class DoctorController {

	@Autowired
	private DoctorService docservice;
		
	
//	@PostMapping("/save-doctor")
//	@Transactional
//	public String registerDoctor(@RequestBody Doctor doctor) {
//			docservice.saveDoctor(doctor);
//			System.out.println("in doctor controller");
//			return "hello  "+doctor.getName()+  "Your registration is successully";
//	}
//	
	@PostMapping("/save-doctor")
	public ResponseEntity<Doctor> registerDoctor(@RequestBody Doctor doctor)
	{
			docservice.saveDoctor(doctor);
			return new ResponseEntity<Doctor>(doctor,HttpStatus.OK);
	}

	
	
	@GetMapping("/getalldoctors")
	public Iterable<Doctor> getAllDoctors(){
		
		return docservice.getAllDoctors();
	}
	
	
	@PostMapping("/doctorlogin")
	
	public Doctor loginDoctor(@RequestBody Doctor doctor) {
		String tempEmail=doctor.getEmail();
		String tempass=doctor.getPassword();
		Doctor doctorobj=null;
		if (tempEmail != null && tempass != null) {
			doctorobj=docservice.findByEmailAndPassword(tempEmail, tempass);	
		}
		return doctorobj;
		
	}
	
}
