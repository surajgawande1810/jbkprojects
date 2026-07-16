package Dr_Doom;

import java.util.Scanner;

public class Power_of_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Num : ");
		int num = sc.nextInt();
		
		System.out.print("Enter Your index: ");
		int index = sc.nextInt();
		int count = 1;
		for (int i = 1; i <= index; i++) {
			count = num * count;// 2 //4 //8//16

		}
		System.out.println(count);
	}
}
