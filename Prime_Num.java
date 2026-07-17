package Dr_Doom;

import java.util.Scanner;

public class Prime_Num {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Num  : ");
		
		int Num = sc.nextInt();
		for (int j = 1; j < Num; j++) {
			int count = 0;
			for (int i = 1; i < j; i++) {
				if (j % i == 0) {
					count++;
				}

			}
			if (count == 1) {
				System.out.println("Prime"+j);
			} else {
				System.out.println("not prime"+j);
			}
		}
	}
}
