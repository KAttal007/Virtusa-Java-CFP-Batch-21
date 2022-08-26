package com.model;

import java.util.Date;
import com.exception.*;
public class Appointment {
	private Date appDate;
	private int noOfPatients;
	public Date getAppDate() {
		return appDate;
	}
	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}
	public int getNoOfPatients() {
		return noOfPatients;
	}
	public void setNoOfPatients(int noOfPatients) throws InvalidDataException {
		if(noOfPatients>0 && noOfPatients<=15 ) {
			this.noOfPatients = noOfPatients;
		}
		else {
			throw new InvalidDataException();
		}
		
	}
	
}
