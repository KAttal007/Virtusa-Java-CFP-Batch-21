package com.service;

import java.util.*;

import com.exception.InvalidDataException;
import com.model.Appointment;
import com.model.Doctor;

public class ClinicUtility {
	public void addDoctor() {
		Scanner sc =new Scanner(System.in);
		Doctor doc=new Doctor();
		DoctorService ds=new DoctorService();
		System.out.println("enter the doctorID:");
		doc.setDocId(sc.next());
		System.out.println("enter the doctor name:");
		doc.setDocName(sc.next());
		if(ds.addDoctor(doc))
		System.out.println("doctor added successfully");
		else
	    System.out.println("unable to add doctor");
		
	}
	public void addAppointment() {
		Scanner sc=new Scanner(System.in);
		Appointment apt=new Appointment();
		DoctorService ds=new DoctorService();
		System.out.println("enter the doc id:");
		String docId=sc.next();
		System.out.println("ent the appointment date:");
		apt.setAppDate(sc.next());
		System.out.println("enter the no if appointments:");
		try {
			apt.setNoOfPatients(sc.nextInt());
		} catch (InvalidDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ds.addAppointments(docId, apt);
	}
	public void printAppointments() {
		Scanner sc=new Scanner(System.in);
		DoctorService ds=new DoctorService();
		System.out.println("enter the doc id:");
		ds.printAppointments(sc.next());
		
	}

}
