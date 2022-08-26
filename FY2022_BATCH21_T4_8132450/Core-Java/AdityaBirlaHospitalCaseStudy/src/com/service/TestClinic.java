package com.service;

import java.text.ParseException;
import java.util.Scanner;

import com.exception.InvalidDataException;

public class TestClinic {
	public void launchApp() throws InvalidDataException,ParseException{
		ClinicUtility cu=new ClinicUtility();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter your choice:");
			System.out.println("1.addDoctor");
			System.out.println("2.addAppointments");
			System.out.println("3.printAppointments");
			System.out.println("4.exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:cu.addDoctor();
				   break;
			case 2:cu.addAppointments();
				   break;
			case 3:cu.printAppointments();
				   break;
			case 4:System.out.println("You are exited.");
				   System.exit(1);
				   break;
			}
		}
	}
	public static void main(String[] args) {
		TestClinic obj=new TestClinic();
		try {
			obj.launchApp();
		}
		catch(InvalidDataException e) {
			System.out.println(e);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		

	}

}
