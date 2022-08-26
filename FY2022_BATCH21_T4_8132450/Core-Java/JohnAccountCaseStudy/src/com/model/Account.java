package com.model;

public class Account {
	private String loginId;
	private String password;
	private String confirmPassword;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	
	public Account(String loginId,String password,String confirmPassword,String firstName,String lastName,String mobileNumber) {
		this.loginId=loginId;
		this.password=password;
		this.confirmPassword=confirmPassword;
		this.firstName=firstName;
		this.lastName=lastName;
		this.mobileNumber=mobileNumber;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}
