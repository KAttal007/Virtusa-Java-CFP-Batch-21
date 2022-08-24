package com.service;

import com.model.Appointment;
import com.model.Doctor;

public interface IDoctorService {
	public boolean addDoctor(Doctor doc);
	public void addAppointments(String docId,Appointment apt);
	public void printAppointments(String docId);
	

}
