package com.main;
import com.business.*;
import com.exception.*;
public class Implementation {

	public static void main(String[] args) {
		BusinessLogic bl=new BusinessLogic();
		try {
			bl.launchApplication();
		}
		catch(PasswordMismatchException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		catch(MobileNumberException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		catch(AccountNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
