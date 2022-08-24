package com.service;

import java.util.Scanner;

public class TestClinic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClinic ds=new TestClinic();
		ds.launchApp();
    
	}
	public void launchApp() {
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("please select a option from above one:");
		
		while(true) {
		System.out.println("1.ADD DOCTOR");
		System.out.println("2.ADD APPOINTMENTS");
		System.out.println("3.PRINT APPOINTMENTS");
		System.out.println("4.EXIT");
		n=sc.nextInt();
		
		ClinicUtility cu=new ClinicUtility();
		switch(n) {
		case 1:
			cu.addDoctor();
			break;
		case 2:
		    cu.addAppointment();
		    break;
		case 3:
			cu.printAppointments();
			break;
		case 4:
			System.out.println("exited!!!");
			System.exit(0);
			break;
		}
		}
		
		
	}

}
