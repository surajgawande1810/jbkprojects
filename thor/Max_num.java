package com.thor;
import java.util.*;
public class Max_num {
//	Method findMax(int a, int b, int c)
	Scanner sc=new Scanner(System.in);
	public int FindMax() {
		System.out.println("Enter A: ");
		int A=sc.nextInt();
		System.out.println("Enter B: ");
		int B=sc.nextInt();
		System.out.println("Enter C: ");
		int C=sc.nextInt();
		if (A>=B && A>=C) {
			System.out.println("A is Greater Than Both ");
			return A;
		}
		else if (B>=A && B>=C) {
			System.out.println("B is Greater Than Both");
			return B;
		}
		else {
			System.out.println("C is Greater Than Both");
			return C;
		}
		
	}
}
