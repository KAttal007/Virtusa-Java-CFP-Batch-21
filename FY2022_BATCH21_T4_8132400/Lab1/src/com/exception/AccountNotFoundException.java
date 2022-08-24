package com.exception;

import java.util.Arrays;

public class AccountNotFoundException extends Exception {

	@Override
	public String toString() {
		return "Account is not Found, Enter a valid Account Details";
	}
	

}
