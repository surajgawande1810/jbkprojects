package Practisenew;

import java.util.*;

public class operator_3 {
//NESTED IF ELSE ******
//	ATM withdrawal
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Pin: ");
		int Pin = sc.nextInt();
		if (Pin != 1234) {
			System.out.println("Enter Your Amount : ");
			long Amt = sc.nextLong();
			if (Amt <= 10000) {
				System.out.println("You Can Withdrwal one time ");
			} else {
				System.out.println("You Cant Withdrwal money at one time ");
			}

		} else {
			System.out.println("Invalid Pin");
		}

	}
}
