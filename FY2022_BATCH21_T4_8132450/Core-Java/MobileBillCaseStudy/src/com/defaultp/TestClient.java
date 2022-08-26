package com.defaultp;
import java.util.Scanner;

import com.bill.*;
public class TestClient {

	public static void main(String[] args) {
		Customer cust[]=new Customer[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Regular cust details:");
		System.out.println("Enter cust id:");
		int cid=sc.nextInt();
		System.out.println("Enter cust name:");
		String cn=sc.next();
		System.out.println("Enter cust mobile number:");
		long mn=sc.nextLong();
		System.out.println("Enter bill number:");
		int bn=sc.nextInt();
		System.out.println("Enter minutes of mobile dial:");
		int minutes=sc.nextInt();
		
		RegularCustomer rc=new RegularCustomer(bn,cid,cn,mn,minutes);
		System.out.println("Enter premium cust details:");
		System.out.println("Enter cust id:");
		cid=sc.nextInt();
		System.out.println("Enter cust name:");
		cn=sc.next();
		System.out.println("Enter cust mobile number:");
		mn=sc.nextLong();
		System.out.println("Enter bill number:");
		bn=sc.nextInt();
		System.out.println("Enter minutes of mobile dial:");
		minutes=sc.nextInt();
		PremiumCustomer pc=new PremiumCustomer(bn,cid,cn,mn,minutes);
		cust[0]=rc;
		cust[1]=pc;
		System.out.println("Regular customer details are:");
		System.out.println("cust id: "+cust[0].getCustId());
		System.out.println("cust name: "+cust[0].getCustName());
		System.out.println("cust mobile number: "+cust[0].getMobileNumber());
		System.out.println("cust bill no: "+rc.getBillNo());
		System.out.println("cust bill amount:"+rc.getBillAmount());
		
		System.out.println("Premium customer details are:");
		
		System.out.println("cust id: "+cust[1].getCustId());
		System.out.println("cust name: "+cust[1].getCustName());
		System.out.println("cust mobile number: "+cust[1].getMobileNumber());
		System.out.println("cust bill no: "+pc.getBillNo());
		System.out.println("cust bill amount:"+pc.getBillAmount());
		
		
		

	}

}
