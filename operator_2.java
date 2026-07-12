package Practisenew;
import java.util.*;
public class operator_2 {
//ELSE IF QUETIONS *****
	public static void main(String[] args) {
//	***Check whether a number is positive, negative, or zero
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Num: ");
		int num=sc.nextInt();
		
		if (num>0) {
			System.out.println("Num is positive");
		}else if(num==0){
			System.out.println("num is zero");
		}
		
		else {
			System.out.println("num is negative");
		}
//		
		
//	****Find the largest of three numbers
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		
		System.out.println("Enter c: ");
		int c=sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("a Is Greater Then both");	
		}
		else if (b>=a && b>=c) {
			System.out.println("b Is Greater Then both");	
		}
		else {
			System.out.println("C is Greater then both");
	}
		
		
//		****** Grade calculator
		System.out.println("Enter Your Marks: ");
//		char Grade=sc.next().charAt(0);
		int Marks=sc.nextInt();
		if (Marks <=100 && Marks >=90) {
			System.out.println("your Grade Is A ");
		}
		else if (Marks <=90 && Marks >=80) {
			System.out.println("Your Grade Is B");
		}
		else if (Marks <=80 && Marks >=70) {
			System.out.println("Your Grade Is C");
		}
		else if (Marks <=70 && Marks >=60) {
			System.out.println("Your Grade Is D");
		}
		else {
			System.out.println("You Are Fail");
		}
	}
	
}
