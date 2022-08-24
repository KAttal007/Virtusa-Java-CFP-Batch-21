package com.service;

import java.util.ArrayList;

import com.model.Appointment;
import com.model.Doctor;

public class DoctorService implements IDoctorService{
	private static ArrayList<Doctor> docList=new ArrayList<Doctor>();

	
	@Override
	public boolean addDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		if(docList.add(doc)){
			return true;
		}else{
		return false;
		}
	}

	@Override
	public void addAppointments(String docId, Appointment apt) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(Doctor dc:docList) {
			if(dc.getDocId().equals(docId)) {
				dc.setAppList(apt);
				flag =false;
			}
		}
		if(flag) {
			System.out.println("Doctor Id doesnt exist");
		}else {
			System.out.println("Appointment added succesfully");
		}
	}

	@Override
	public void printAppointments(String docId) {
		// TODO Auto-generated method stub
		boolean flag =true;
		for(Doctor dc:docList) {
			if(dc.getDocId().equals(docId)) {
				ArrayList<Appointment> alist= dc.getAppList();
				for(Appointment apt:alist) {
					System.out.println("Date"+apt.getAppDate());
					System.out.println("no of paitents"+apt.getNoOfPatients());
				}
				flag=false;
			}
		}
		if(flag) {
			System.out.println("doctor id doesnt not exist!");
		}
	}

	

}
