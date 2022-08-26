package com.utility;

import java.util.Scanner;
import com.service.*;
public class DVDInfoUtility {
	public void menu() {
		Scanner sc=new Scanner(System.in);
		FileServiceImpl fsi=new FileServiceImpl();
		while(true) {
		System.out.println("Enter your choice:");
		System.out.println("1.readData");
		System.out.println("2.addData");
		System.out.println("3.deleteData");
		System.out.println("4.writeData");
		System.out.println("5.sortData");
		System.out.println("6.displayData");
		System.out.println("7.exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:fsi.readData();
			   break;
		case 2:fsi.addData();
		       break;
		case 3:fsi.deleteData();
		       break;
		case 4:fsi.writeData();
		       break;
		case 5:fsi.sortData();
		       break;
		case 6:fsi.displayData();
		   	   break;
		case 7:System.out.println("You are exited.");
			   System.exit(1);
			   break;
			   
		}
		}
	}
}
