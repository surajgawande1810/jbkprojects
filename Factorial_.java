package Dr_Doom;

import java.util.Scanner;

public class Factorial_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num To Get It's Factorial: ");
		int num = sc.nextInt();
		int factorial  =1;
//		for (int i = 1; i <= num; i++) {   // both ways are correct 
//			factorial *= i ;             
//		}
		for (int i = num; i >= 1; i--) {
			factorial *=i ;
		}
		System.out.println(factorial);
	}
}
