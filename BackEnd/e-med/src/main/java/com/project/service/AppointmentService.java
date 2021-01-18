package com.project.service;

import java.util.Optional;

import com.project.pojos.Appointment;

public interface AppointmentService {
	
	Appointment create(Appointment appointment);
	
	Appointment update(int id,Appointment appointment );
	
	Appointment updateStatus(int id,Appointment appointment);
	
	Optional<Appointment> findById(int id);
	
	void deleteById(int id);
}
