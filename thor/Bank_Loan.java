package com.thor;
import java.util.*;
public class Bank_Loan {
//	Bank Interest
//	Method calculateInterest(double principal, double rate, int time).
	double rate=0.20;
	int time=2;
	public double Loan() {
Scanner sc=new Scanner (System.in);
System.out.println("Enter Your Loan Amt:" );
double Pamt =sc.nextDouble();
double count=(Pamt*rate)*2;
double Totalamt=Pamt+count;
return Totalamt;

		
		
		
		
	}
	
	
	
}
