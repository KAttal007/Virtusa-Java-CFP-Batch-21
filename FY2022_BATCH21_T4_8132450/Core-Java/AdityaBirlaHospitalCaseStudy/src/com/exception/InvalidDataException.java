package com.exception;

public class InvalidDataException extends Exception{
	public String toString() {
		return "No of patients must be between 1 to 15";
	}
}
