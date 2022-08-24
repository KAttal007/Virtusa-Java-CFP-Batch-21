package com.model;

import java.util.*;

import com.exception.InvalidDataException;

public class Appointment {
	private String appDate;
	private int noOfPatients;
	
	
	public String getAppDate() {
		return appDate;
	}
	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}
	public int getNoOfPatients() {
		return noOfPatients;
	}
	public void setNoOfPatients(int noOfPatients) throws InvalidDataException {
		if(noOfPatients > 15 || noOfPatients < 1) {
			throw new InvalidDataException();
		}
		this.noOfPatients = noOfPatients;
		
	}
	
	
	
	

}
