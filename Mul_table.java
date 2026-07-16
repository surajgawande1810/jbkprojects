package Dr_Doom;

import java.util.Scanner;

public class Mul_table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Num: ");		
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(i*num);
	}
}
