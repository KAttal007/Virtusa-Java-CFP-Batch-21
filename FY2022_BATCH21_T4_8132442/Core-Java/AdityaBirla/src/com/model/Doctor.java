package com.model;

import java.util.*;

public class Doctor {
	private String docId;
	private String docName;
	private ArrayList<Appointment> appList=new ArrayList<Appointment>();
	
	
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public ArrayList<Appointment> getAppList() {
		return appList;
	}
	
	public void setAppList(Appointment apt) {
		this.appList.add(apt);
	}
	

}
