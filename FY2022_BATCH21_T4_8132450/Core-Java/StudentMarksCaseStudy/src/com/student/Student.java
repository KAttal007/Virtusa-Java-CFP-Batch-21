package com.student;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Student implements StudentInt,Serializable{
	private int rollNo;

	private String name;  

	private int subject1; 

	private int subject2;  

	private int subject3;

	private int totalMarks;

	Student stud1;
	int tm,s1,s2,s3;
	@Override
	public void readStudentInfo() {
		Scanner sc=new Scanner(System.in);
		stud1=new Student();
		System.out.println("Enter student rollno:");
		int r=sc.nextInt();
		System.out.println("Enter student name:");
		String n=sc.next();
		System.out.println("Enter subject 1 marks:");
		s1=sc.nextInt();
		System.out.println("Enter subject 2 marks:");
		s2=sc.nextInt();
		System.out.println("Enter subject 3 marks:");
		s3=sc.nextInt();
		stud1.rollNo=r;
		stud1.name=n;
		stud1.subject1=s1;
		stud1.subject2=s2;
		stud1.subject3=s3;
	
		
		stud1.totalMarks=calcTotal();
		try {
			FileOutputStream fos=new FileOutputStream("StudentInfo.txt");
			ObjectOutputStream obj=new ObjectOutputStream(fos);
			obj.writeObject(stud1);
			obj.flush();
			
		} 
		catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	@Override
	public int calcTotal() {
		return (s1+s2+s3);
		
	}

	@Override
	public void printStudentInfo() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("StudentInfo.txt");
			ObjectInputStream obj=new ObjectInputStream(fis);
			try {
				Student st=(Student)obj.readObject();
				System.out.println(st.rollNo);
				System.out.println(st.name);
				System.out.println(st.subject1);
				System.out.println(st.subject2);
				System.out.println(st.subject3);
				System.out.println(st.totalMarks);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
}
