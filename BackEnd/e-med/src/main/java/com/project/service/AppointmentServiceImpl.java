package com.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.AppointmentRepository;
import com.project.pojos.Appointment;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	public AppointmentServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Appointment create(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
	@Override
	public Appointment update(int id, Appointment appointment) {
		
		return appointmentRepository.save(appointment);
	}
	
	@Override
	public Appointment updateStatus(int id, Appointment appointment) {
		
		Optional<Appointment> appointmentList=appointmentRepository.findById(id);
		
		if (appointmentList.isPresent()) {
				if (appointment.getStatus()!=null) {
					appointmentList.get().setStatus(appointment.getStatus());
				}
				return appointmentRepository.save(appointmentList.get());
			
		}
		return null;
		
	}
	@Override
	public Optional<Appointment> findById(int id) {
		
		return appointmentRepository.findById(id);
	}
	@Override
	public void deleteById(int id) {
		
		appointmentRepository.deleteById(id);
	}
	
	
	
	
		
}
