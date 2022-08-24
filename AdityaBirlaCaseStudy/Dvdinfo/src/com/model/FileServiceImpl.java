package com.model;

import java.io.*;
import java.util.*;

public class FileServiceImpl implements FileService{
	private List<DVDInfo>dvdinfo=new ArrayList<DVDInfo>();

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("C:\\Users\\Sai Abishek\\Documents\\dvdinfo.txt");
			BufferedReader br=new BufferedReader(fr);
			String str1;
			while((str1=br.readLine())!=null) {
				String str[]=str1.split(",");
				DVDInfo d=new DVDInfo(str[0],str[1],str[2]);
				dvdinfo.add(d);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addData() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Title:");
		String t=sc.next();
		System.out.println("enter the Genre:");
		String g=sc.next();
		System.out.println("enter the LeadActor:");
		String l=sc.next();
		DVDInfo d=new DVDInfo(t,g,l);
		dvdinfo.add(d);
		System.out.println("Added Succesfully!!!");
		writeData();
		
	}

	@Override
	public void deleteData() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the object which wanted to be deleted:");
		int o=sc.nextInt();
		o=o-1;
		dvdinfo.remove(o);
		System.out.println("deleted succcessfully!!1");
		writeData();
		
		
	}

	@Override
	public void writeData() {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fw=new FileOutputStream("C:\\Users\\Sai Abishek\\Documents\\dvdinfo.txt");
			PrintStream ps=new PrintStream(fw);
			for(DVDInfo dv:dvdinfo) {
				String t=dv.getTitle();
				String g=dv.getGenre();
				String l=dv.getLeadActor();
				ps.println(t+","+g+","+l);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void sortData() {
		// TODO Auto-generated method stub
		Collections.sort(dvdinfo);
		System.out.println("sorted Succesfully!!!");
		writeData();
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("C:\\Users\\Sai Abishek\\Documents\\dvdinfo.txt");
			BufferedReader br=new BufferedReader(fr);
			String str1;
			while((str1=br.readLine())!=null) {
				System.out.println(str1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
