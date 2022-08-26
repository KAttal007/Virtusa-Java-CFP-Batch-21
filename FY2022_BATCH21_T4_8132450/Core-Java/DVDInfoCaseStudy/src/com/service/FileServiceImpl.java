package com.service;
import com.model.*;
import java.util.*;
import java.io.*;
public class FileServiceImpl implements FileService {
	private List<DVDInfo> dvdinfo=new ArrayList<DVDInfo>();
	@Override
	public void readData() {
		try {
			FileReader	fr = new FileReader("dvdinfo.txt");
			BufferedReader br=new BufferedReader(fr);
			String str1;
			while((str1=br.readLine())!=null) {
				String str[]=str1.split(",");
				DVDInfo d=new DVDInfo(str[0],str[1],str[2]);
				dvdinfo.add(d);
			}
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void addData() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter title:");
			String t=sc.next();
			System.out.println("Enter genre:");
			String g=sc.next();
			System.out.println("Enter lead actor:");
			String l=sc.next();
			DVDInfo d=new DVDInfo(t,g,l);
			dvdinfo.add(d);
			System.out.println("added successfully.");
			writeData();	
	}

	@Override
	public void deleteData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which object to be deleted:");
		int r=sc.nextInt();
		r=r-1;
		dvdinfo.remove(r);
		System.out.println("removed successfully.");
		writeData();
		
	}

	@Override
	public void writeData() {
		try {
			FileOutputStream fw = new FileOutputStream("dvdinfo.txt");
			PrintStream ps=new PrintStream(fw);
			for(DVDInfo dv:dvdinfo) {
				String ti=dv.getTitle();
				String ge=dv.getGenre();
				String la=dv.getLeadActor();
				ps.println(ti+","+ge+","+la);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void sortData() {
		
		Collections.sort(dvdinfo);
		System.out.println("Sorted successfully.");
		writeData();
	}

	@Override
	public void displayData() {
		try {
			FileReader	fr = new FileReader("dvdinfo.txt");
			BufferedReader br=new BufferedReader(fr);
			String str1;
			while((str1=br.readLine())!=null) {
				System.out.println(str1);
			}
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
