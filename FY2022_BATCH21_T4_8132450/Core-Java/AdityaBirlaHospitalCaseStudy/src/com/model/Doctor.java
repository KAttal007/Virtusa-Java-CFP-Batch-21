package com.model;

import java.util.ArrayList;

public class Doctor {
	private String docId;
	private String docName;
	private ArrayList<Appointment> apptList=new ArrayList<Appointment>();
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
	public ArrayList<Appointment> getApptList() {
		return apptList;
	}
	public void setApptList(ArrayList<Appointment> apptList) {
		this.apptList = apptList;
	}
	
}
