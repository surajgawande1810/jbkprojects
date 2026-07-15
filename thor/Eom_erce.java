package com.thor;
import java.util.*;
public class Eom_erce {
//	E-commerce Discount
//	Method calculateDiscount(double price) returns final price after discount.
	Scanner sc=new Scanner(System.in);
	double Discount=0.10;
	
	public double disc() {
System.out.println("The Price Is Before Disc: ");	
		double Price=sc.nextInt();
		double TotalD =Price*Discount;
		double TotalAmt=Price-TotalD;
		
		return TotalAmt;
	}
	
}
