package com.model;

import java.util.*;

public class DVDInfoUtility {
	Scanner sc=new Scanner(System.in);
	
	public void menu(){
		int ch=0;
		while(true) {
		
		System.out.println("choose the below options:");
		System.out.println("-------------------------");
		System.out.println("1.read the data");
		System.out.println("2.add the data");
		System.out.println("3.delete the data");
		System.out.println("4.write the data");
		System.out.println("5.sort the data");
		System.out.println("6.display the data");
		System.out.println("7.exit");
		ch=sc.nextInt();
		FileServiceImpl fsl= new FileServiceImpl();
		switch(ch) {
		case 1:
			fsl.readData();
			break;
		case 2:
			fsl.addData();
			break;
		case 3:
			fsl.deleteData();
			break;
		case 4:
			fsl.writeData();
			break;
		case 5:
			fsl.sortData();
			break;
		case 6:
			fsl.displayData();
			break;
		case 7:
			System.out.println("exited!!!");
			System.exit(1);
			break;
			
		}
		
		}
		 
		
	}

}
