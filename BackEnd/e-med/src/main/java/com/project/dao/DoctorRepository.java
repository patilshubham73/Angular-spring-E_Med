package com.project.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.pojos.Doctor;
import com.project.pojos.User;

public interface DoctorRepository extends CrudRepository<Doctor,Integer> {
	
	public Doctor findByEmailAndPassword(String email,String password);
	
}
