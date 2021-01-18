package com.project.pojos;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor_tbl")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer doctorId;
	@Column(length = 35)
	private String name;
	private String email;
	private String mobile;
	private String address;
	@Column(length = 150)
	private String password;
	@Column(length = 35)
	private double fees;
	private String specialities;
	private String education;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(Integer doctorId, String name, String email, String mobile, String address, String password,
			double fees, String specialities, String education) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.password = password;
		this.fees = fees;
		this.specialities = specialities;
		this.education = education;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getSpecialities() {
		return specialities;
	}

	public void setSpecialities(String specialities) {
		this.specialities = specialities;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + ", password=" + password + ", fees=" + fees + ", specialities="
				+ specialities + ", education=" + education + "]";
	}
	
	
	
	

	
	
	
}
