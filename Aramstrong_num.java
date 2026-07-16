package Dr_Doom;

import java.util.Scanner;

public class Aramstrong_num {
	//14. Armstrong Number
	//Check whether a number is an Armstrong number.
//	1 + 125 + 27 = 153-->1^3=1,5^3=125,3^3=27=153
	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);

       System.out.print("Enter a number: ");
       int num = sc.nextInt();

       int original = num;
       int temp = num;
       int digits = 0;//for length of num
       int sum = 0;// 1^3=1,5^3=125,3^3=27=153

       // Count the number of digits
       while (temp != 0) {
           digits++;
           temp = temp / 10;
       }

       temp = num;

       // Calculate sum of digits raised to the power of digits
       while (temp != 0) {
           int digit = temp % 10;
           sum += Math.pow(digit, digits);
           temp = temp / 10;
       }

       // Check Armstrong number
       if (sum == original) {
           System.out.println(original + " is an Armstrong Number.");
       } else {
           System.out.println(original + " is Not an Armstrong Number.");
       }
		
		
		
	}
	}
	
