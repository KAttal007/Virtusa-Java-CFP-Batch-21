package com.exception;

public class PasswordMismatchException extends Exception{
	public String toString() {
		return "password and confirm password must be same";
	}
}
