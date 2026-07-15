package com.thor;

import java.util.Scanner;

public class Em_Sal {
//	Method calculateSalary(double basic) returns salary after HRA & DA.
	
	public double Cal_Sal() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Your salary: ");
		long Salary=sc.nextLong();
		
		double hra,da,bonus,totalsal;
		
		hra=Salary*0.20;
		da=Salary*0.50;
		
		if (Salary>=50000) {
			bonus=Salary*0.10;
		}
		else {
			bonus=Salary*0.05;
		}

//		total salary;
		
		totalsal=Salary+hra+da+bonus;
		System.out.println(totalsal);
		
		
		return totalsal;
	}
}
