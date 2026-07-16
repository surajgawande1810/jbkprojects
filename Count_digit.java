package Dr_Doom;

import java.util.Scanner;

public class Count_digit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Num : ");
	int num = sc.nextInt();
		int count=0;
	while(num>0) {
		num/=10;
		count++;
	}
	System.out.println(count);
	
	
}
}
