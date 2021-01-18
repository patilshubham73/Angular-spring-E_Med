package com.project.controller;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.pojos.Appointment;
import com.project.service.AppointmentService;

@RestController
public class AppointController {

	@Autowired
	private AppointmentService appointmentService;
		
	@PostMapping("/create-appointment")
	@Transactional
	public Appointment create(@RequestBody Appointment appointment) {
		System.out.println("in appointment controller"+getClass());
		return appointmentService.create(appointment);
	}
	
	@PutMapping("/update-appointment/{id}")
	public Appointment update(@PathVariable int id,@RequestBody Appointment appointment) {
		return appointmentService.update(id, appointment);
	}
	@PutMapping("/update-status/{id}")
	public Appointment updateStatus(@PathVariable int id,@RequestBody Appointment appointment) {
		return appointmentService.updateStatus(id, appointment);
	}
	
	@GetMapping("/find-appointment/{id}")
	public Optional<Appointment> findById(@PathVariable int id){
		
		return appointmentService.findById(id);
	}
	
	@DeleteMapping("/delete-appointment/{id}")
	void deleteById(@PathVariable int id) {
		System.out.println("deleted appoinment successfully");
		appointmentService.deleteById(id);
	}
	
}
