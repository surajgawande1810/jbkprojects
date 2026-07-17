package Dr_Doom;
import java.util.*;
public class Perfect_Num {
public static void main(String[] args) {
//	6 = 1 + 2 + 3
//	28 = 1 + 2 + 4 + 7 + 14
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter Your Num: ");
	int Num=sc.nextInt();
	int Count=0;
	for(int i=1;i<Num;i++) {
		if (Num % i == 0) {
			Count=Count+i;
		}
		}
	if (Count==Num) {
		System.out.println(Num + "Num Is Perfect");
	}
	else {
		System.out.println("Num Not Perfect");
	}
}
}
