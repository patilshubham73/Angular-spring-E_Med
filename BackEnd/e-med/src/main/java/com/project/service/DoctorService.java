package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.DoctorRepository;
import com.project.pojos.Doctor;
import com.project.pojos.User;

@Service
public class DoctorService {
		
	@Autowired
	private DoctorRepository doctor_repo;
	
	public DoctorService() {
		// TODO Auto-generated constructor stub
	}

	public DoctorService(DoctorRepository doctor_repo) {
		super();
		this.doctor_repo = doctor_repo;
	}
	
	public void saveDoctor(Doctor doctor) {
			doctor_repo.save(doctor);
	}
	
	public Iterable<Doctor> getAllDoctors(){
		return doctor_repo.findAll();
	}
	
	public Doctor findByEmailAndPassword(String email,String password) {
		return doctor_repo.findByEmailAndPassword(email, password);
}
	
}
