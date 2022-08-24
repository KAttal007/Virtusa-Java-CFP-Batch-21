package com.business;

import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import com.exception.MobileNumberException;
import com.exception.PasswordMismatchException;
import com.model.Account;
import com.service.AccountServiceImpl;

public class BusinessLogic {
	
	AccountServiceImpl as1 = new AccountServiceImpl();

	
	
	public void launchApplication(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Menu.....");
			System.out.println("1)Creating Account");
			System.out.println("2)SearchById");
			System.out.println("3)searchByName");
			System.out.println("4)DeleteById");
			System.out.println("5)Exit");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			try {
			switch(choice){
			case 1:
				System.out.println("Enter Account Details");
				System.out.println("Enter login Id");
				String id =sc.next();
				System.out.println("Enter Password");
				String password =sc.next();
				System.out.println("Confirm Password");
				String confirmpassword =sc.next();
				System.out.println("Enter First Name");
				String firstname =sc.next();
				System.out.println("Enter Last Name");
				String lastname =sc.next();
				System.out.println("Enter Mobile No");
				String mobileno =sc.next();
				as1.createAccount(new Account(id,password,confirmpassword,firstname,lastname,mobileno));
				break;
			case 2:
				System.out.println("Enter Id:");
				System.out.println(as1.searchById(sc.next()));
				break;
			case 3:
				System.out.println("Enter First Name:");
				try {
					System.out.println(as1.searchByFirstName(sc.next()));
				} catch (com.exception.AccountNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("Enter Id");
				System.out.println(as1.deleteId(sc.next()));
				break;
			case 5:
				System.out.println("Session Logout.");
				break;	}
				
			}
			catch(MobileNumberException e) {
				e.printStackTrace();
			}
			catch(PasswordMismatchException e) {
				e.printStackTrace();
			}
		
		
		}
	}
	
	

}
