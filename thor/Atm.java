package com.thor;
import java.util.*;
public class Atm {
//	ATM System
//	Create a method checkBalance() that displays account balance.
//	Create a method withdrawAmount(double amount) to deduct balance.
 Scanner sc=new Scanner(System.in);	
 int balance =50000;
	public void checkbalance() {
System.out.println("Enter Your pin: ");		
		int Pin=sc.nextInt();  
		if (Pin==1234) {
			System.out.println("Your Balance Is:50000");
		}
	}
	
	
	public void withdrwalamt() {
		System.out.println("Withdrwal amount is: ");
		int wiAmt=sc.nextInt();  
		int Total=balance-wiAmt;
		System.out.println("Balance Left : "+Total);
		
		
	}
}
