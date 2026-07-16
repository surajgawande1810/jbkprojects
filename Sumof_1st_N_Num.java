package Dr_Doom;

import java.util.Scanner;

public class Sumof_1st_N_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int Num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=Num;i++) {
//			 sum +=i+(++i); //Both are same ;
//			sum+=i; // 
		}
		System.out.println(sum);	
	}
}
