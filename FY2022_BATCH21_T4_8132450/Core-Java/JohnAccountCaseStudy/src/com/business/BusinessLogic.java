package com.business;
import com.service.*;
import com.model.*;
import com.exception.*;
import java.util.Scanner;

public class BusinessLogic {
	public void launchApplication() throws PasswordMismatchException,MobileNumberException,AccountNotFoundException {
		AccountServiceImpl asl=new AccountServiceImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			String mp="[0-9]{10}";
			System.out.println("Enter your choice:");
			System.out.println("1.Creating Account");
			System.out.println("2.SearchById");
			System.out.println("3.SearchByName");
			System.out.println("4.DeleteById");
			System.out.println("5.Exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter login id:");
				   String lid=sc.next();
				   System.out.println("Enter password:");
				   String p=sc.next();
				   System.out.println("Enter confirm password:");
				   String cp=sc.next();
				   if(!(p.equals(cp))) {
					   throw new PasswordMismatchException();
				   }
				   System.out.println("Enter first name:");
				   String f=sc.next();
				   System.out.println("Enter last name:");
				   String l=sc.next();
				   System.out.println("Enter mobile number:");
				   String m=sc.next();
				   if(!m.matches(mp)) {
					   throw new MobileNumberException();
				   }
				   Account obj=new Account(lid,p,cp,f,l,m);
				   asl.createAccount(obj);
				   break;
			case 2:System.out.println("Enter id:");
				   String id=sc.next();
				   obj=asl.searchById(id);
				   if(obj!=null) {
					   System.out.println("Account details are:");
					   System.out.println("Login id:"+obj.getLoginId());
					   System.out.println("Firstname:"+obj.getFirstName());
					   System.out.println("Lastname:"+obj.getLastName());
					   System.out.println("Mobile Number:"+obj.getMobileNumber());
				   }
				   else {
					   System.out.println("Account is not found");
				   }
				   break;
			case 3:System.out.println("Enter first name:");
				   String fn=sc.next();
				   obj=asl.searchByFirstName(fn);
				   if(obj!=null) {
					   System.out.println("Account details are:");
					   System.out.println("Login id:"+obj.getLoginId());
					   System.out.println("Firstname:"+obj.getFirstName());
					   System.out.println("Lastname:"+obj.getLastName());
					   System.out.println("Mobile Number:"+obj.getMobileNumber());
				   }
				   else {
						throw new AccountNotFoundException();
				   }
				   break;
			case 4:System.out.println("Enter id to delete account:");
				   String d=sc.next();
				   boolean b=asl.deleteById(d);
				   if(b) {
					   System.out.println("Account deleted");
				   }
				   else {
					   System.out.println("Account not found");
				   }
				   break;
			case 5:System.out.println("Exited..");
				   System.exit(1);
				   break;
			}
			
		}
	}
}
