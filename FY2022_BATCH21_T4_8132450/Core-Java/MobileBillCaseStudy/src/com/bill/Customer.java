package com.bill;

 public abstract class Customer {
	int custId;
	String custName;
	long mobileNumber;
	
	public Customer(int custId,String custName,long mobileNumber) {
		this.custId=custId;
		this.custName=custName;
		this.mobileNumber=mobileNumber;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public abstract double calculateBill(int minutes) ;
}
