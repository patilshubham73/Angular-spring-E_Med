package com.project.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.pojos.Appointment;

public interface AppointmentRepository  extends CrudRepository<Appointment, Integer>{

}
