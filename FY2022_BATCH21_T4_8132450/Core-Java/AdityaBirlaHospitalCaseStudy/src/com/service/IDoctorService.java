package com.service;

import com.model.Appointment;
import com.model.Doctor;
public interface IDoctorService {
	public boolean addDoctor(Doctor d);
	public void addAppointments(String docId,Appointment appt);
	public void printAppointments(String docId);
	
}
