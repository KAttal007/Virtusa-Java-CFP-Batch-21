package com.exception;

import java.util.Arrays;

public class PasswordMismatchException extends Exception {

	@Override
	public String toString() {
		return "Password is not matched.";
	}
	

}
