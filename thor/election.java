package com.thor;

import java.util.Scanner;

public class election {
//	Method vote(int age) → allow only if age ≥ 18
	Scanner sc = new Scanner(System.in);

	public void Vote() {
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You Can Vote ");
		} else {
			System.out.println("You Cant Vote");
		}

	}
}
