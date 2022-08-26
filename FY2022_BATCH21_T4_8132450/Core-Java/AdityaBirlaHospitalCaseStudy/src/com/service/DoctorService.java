package com.service;

import java.util.ArrayList;

import com.model.Appointment;
import com.model.Doctor;

public class DoctorService implements IDoctorService{
	private ArrayList<Doctor> docList =new ArrayList<Doctor>();
	@Override
	public boolean addDoctor(Doctor d) {
		docList.add(d);
		return true;
	}

	@Override
	public void addAppointments(String docId, Appointment appt) {
		int available=0;
		for(Doctor d:docList) {
			if(d.getDocId().equals(docId)) {
				available=1;
				d.getApptList().add(appt);
				System.out.println("Appointment added.");
			}
		}
		if(available==0) {
			System.out.println("Doctor ID does not exists.");
		}
		
	}

	@Override
	public void printAppointments(String docId) {
		int available=0;
		for(Doctor d:docList) {
			if(d.getDocId().equals(docId)) {
				available=1;
				for(Appointment appt:d.getApptList()) {
					String str=appt.getAppDate().toString();
					String str1=str.substring(4,11)+str.substring(24,28);
					System.out.println("Appointment date:"+str1);
					System.out.println("Number of patients:"+appt.getNoOfPatients());
				}
				
			}
			
		}
		if(available==0) {
			System.out.println("Doctor ID does not exists.");
		}
		
	}

}
