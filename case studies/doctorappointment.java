Appointment.java

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

InvalidDataException.java

package com.exception;

public class InvalidDataException extends Exception{
public String toString() {
return "No of patients must be between 1 to 15";
}
}

Doctor.java

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

IDoctorService.java

package com.service;

import com.model.Appointment;
import com.model.Doctor;

public interface IDoctorService {
public boolean addDoctor(Doctor d);
public void addAppointments(String docId,Appointment appt);
public void printAppointments(String docId);

}

DoctorService.java

package com.service;

import java.util.ArrayList;

import com.model.Appointment;
import com.model.Doctor;

public class DoctorService implements IDoctorService{
private ArrayList<Doctor> docList =new ArrayList<Doctor>();
@Override
public boolean addDoctor(Doctor d) {
docList.add(d);
return true;
}

@Override
public void addAppointments(String docId, Appointment appt) {
int available=0;
for(Doctor d:docList) {
if(d.getDocId().equals(docId)) {
available=1;
d.getApptList().add(appt);
}
}
if(available==0) {
System.out.println("Doctor ID does not exists.");
}

}

@Override
public void printAppointments(String docId) {
int available=0;
for(Doctor d:docList) {
if(d.getDocId().equals(docId)) {
available=1;
for(Appointment appt:d.getApptList()) {
String str=appt.getAppDate().toString();
String str1=str.substring(4,11)+str.substring(24,28);
System.out.println("Appointment date:"+str1);
System.out.println("Number of patients:"+appt.getNoOfPatients());
}

}

}
if(available==0) {
System.out.println("Doctor ID does not exists.");
}

}

}

ClinicUtility.java

package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.exception.InvalidDataException;
import com.model.Appointment;
import com.model.Doctor;

public class ClinicUtility {
Scanner sc=new Scanner(System.in);
Doctor d;
Appointment appt;
DoctorService ds=new DoctorService();
public void addDoctor() {
d=new Doctor();
System.out.println("Enter doctor id:");
String did=sc.next();
System.out.println("Enter doctor name:");
String dname=sc.next();
d.setDocId(did);
d.setDocName(dname);
boolean res=ds.addDoctor(d);
if(res) {
System.out.println("Docter added successfully.");
}
}
public void addAppointments() throws InvalidDataException,ParseException{
appt=new Appointment();
System.out.println("Enter doctor id:");
String did=sc.next();
System.out.println("Enter appointment date:");
String appdate=sc.next();
System.out.println("Enter no of patients:");
int nop=sc.nextInt();
appt.setNoOfPatients(nop);
SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");

appt.setAppDate(d.parse(appdate));
ds.addAppointments(did,appt);

}
public void printAppointments() {
System.out.println("Enter doctor id:");
String did=sc.next();
ds.printAppointments(did);

}
}

TestClinic.java

package com.service;

import java.text.ParseException;
import java.util.Scanner;

import com.exception.InvalidDataException;

public class TestClinic {
public void launchApp() throws InvalidDataException,ParseException{
ClinicUtility cu=new ClinicUtility();
Scanner sc=new Scanner(System.in);
while(true) {
System.out.println("Enter your choice:");
System.out.println("1.addDoctor");
System.out.println("2.addAppointments");
System.out.println("3.printAppointments");
System.out.println("4.exit");
int ch=sc.nextInt();
switch(ch) {
case 1:cu.addDoctor();
  break;
case 2:cu.addAppointments();
  break;
case 3:cu.printAppointments();
  break;
case 4:System.out.println("You are exited.");
  System.exit(1);
  break;
}
}
}
public static void main(String[] args) {
TestClinic obj=new TestClinic();
try {
obj.launchApp();
}
catch(InvalidDataException e) {
System.out.println(e);
}
catch(ParseException e) {
e.printStackTrace();
}


}

}