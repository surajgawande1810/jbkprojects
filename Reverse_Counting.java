package Dr_Doom;

import java.util.Scanner;

public class Reverse_Counting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Num : ");
		int num = sc.nextInt();
        for (int i=num;i>=1;i--) {
        	System.out.println(i);
        }
	}
}
