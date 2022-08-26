package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.exception.InvalidDataException;
import com.model.Appointment;
import com.model.Doctor;

public class ClinicUtility {
	Scanner sc=new Scanner(System.in);
	Doctor d;
	Appointment appt;
	DoctorService ds=new DoctorService();
	public void addDoctor() {
		d=new Doctor();
		System.out.println("Enter doctor id:");
		String did=sc.next();
		System.out.println("Enter doctor name:");
		String dname=sc.next();
		d.setDocId(did);
		d.setDocName(dname);
		boolean res=ds.addDoctor(d);
		if(res) {
			System.out.println("Docter added successfully.");
		}
	}
	public void addAppointments() throws InvalidDataException,ParseException{
		appt=new Appointment();
		System.out.println("Enter doctor id:");
		String did=sc.next();
		System.out.println("Enter appointment date:");
		String appdate=sc.next();
		System.out.println("Enter no of patients:");
		int nop=sc.nextInt();
		appt.setNoOfPatients(nop);
		SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
		
		appt.setAppDate(d.parse(appdate));
		ds.addAppointments(did,appt);
		
	}
	public void printAppointments() {
		System.out.println("Enter doctor id:");
		String did=sc.next();
		ds.printAppointments(did);
		
	}
}
