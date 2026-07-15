package com.thor;

public class elec_Bill {
//	Electricity Bill
//	Method calculateBill(int units) returns total bill amount.
	int Units ;
	int rate;
	public int cal_Ebill(int Units,int rate) {
		int TotalEbill=Units*rate;
		return TotalEbill;
		
	}
	
	
}
