package com.bill;

public class PremiumCustomer extends Customer {
	int billNo;
	float billAmount;
	
	public PremiumCustomer(int billNo,int custId,String custName,long mobileNumber,int minutes) {
		super(custId,custName,mobileNumber);
		this.billNo=billNo;	
		this.billAmount=(float)calculateBill(minutes);
	}

	public int getBillNo() {
		return billNo;
	}

	public float getBillAmount() {
		return billAmount;
	}

	@Override
	public double calculateBill(int minutes) {
		 double cost=0;
		 int min=40;
			for(int i=1;i<=min;i++){
			    if(i<=30){
			        cost=cost+1;
			    }
			    else{
			        cost=cost+0.5;
			    }
			}
			
		return cost;
	}
	
	
}
