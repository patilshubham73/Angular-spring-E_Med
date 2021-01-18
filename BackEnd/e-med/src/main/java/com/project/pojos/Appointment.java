package com.project.pojos;


import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment_tbl")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate appointmentDate;
	private Time appointmentStartTime;
	private Time appointmentEndTime;
	private String nameOfDoctor;
	private AppointmentStatus status = AppointmentStatus.Booked;
	
	
	public Appointment() {
		// TODO Auto-generated constructor stub
	}


	public Appointment(Integer id, LocalDate appointmentDate, Time appointmentStartTime, Time appointmentEndTime,
			String nameOfDoctor, AppointmentStatus status) {
		super();
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.appointmentStartTime = appointmentStartTime;
		this.appointmentEndTime = appointmentEndTime;
		this.nameOfDoctor = nameOfDoctor;
		this.status = status;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}


	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	public Time getAppointmentStartTime() {
		return appointmentStartTime;
	}


	public void setAppointmentStartTime(Time appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}


	public Time getAppointmentEndTime() {
		return appointmentEndTime;
	}


	public void setAppointmentEndTime(Time appointmentEndTime) {
		this.appointmentEndTime = appointmentEndTime;
	}


	public String getNameOfDoctor() {
		return nameOfDoctor;
	}


	public void setNameOfDoctor(String nameOfDoctor) {
		this.nameOfDoctor = nameOfDoctor;
	}


	public AppointmentStatus getStatus() {
		return status;
	}


	public void setStatus(AppointmentStatus status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointmentDate=" + appointmentDate + ", appointmentStartTime="
				+ appointmentStartTime + ", appointmentEndTime=" + appointmentEndTime + ", nameOfDoctor=" + nameOfDoctor
				+ ", status=" + status + "]";
	}
	
	
	
	
	
}
