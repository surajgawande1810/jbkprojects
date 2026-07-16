package Dr_Doom;
import java.util.*;
public class Even_Num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Num To Check It is Even/Odd : ");
	int Num=sc.nextInt();
	if (Num%2==0) {
		System.out.println("Num Is Even....!");
	}
	else {
		System.out.println("Num Is Odd....!");
	}
}
}
