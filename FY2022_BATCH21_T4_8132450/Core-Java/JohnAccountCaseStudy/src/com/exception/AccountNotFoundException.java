package com.exception;

public class AccountNotFoundException extends Exception{
	public String toString() {
		return "Account is not found";
	}
}
