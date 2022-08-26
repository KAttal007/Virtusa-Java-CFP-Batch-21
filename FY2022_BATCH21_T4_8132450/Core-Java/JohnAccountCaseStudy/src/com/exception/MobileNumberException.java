package com.exception;

public class MobileNumberException extends Exception{
public String toString() {
	return "mobile number should be in digits and should not be lessthan 10 digits";
}
}
