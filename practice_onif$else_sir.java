package Practisenew;
import java.util.*;
public class practice_onif$else_sir {
public static void main(String[] args) {
//	write a program for employee salary cal:
//	basic salary,HRA=20%,DA=50%,if sal>50000->10%,else ->5%
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

//	total salary;
	
	totalsal=Salary+hra+da+bonus;
	System.out.println(totalsal);
	
	
}
}
