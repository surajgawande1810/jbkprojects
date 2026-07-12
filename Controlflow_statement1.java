package FromStarting;

public class Controlflow_statement1 {
//if-->if-else-->else if-->nested all-->Switch Case --> Break & Continue;
	
	public static void main(String[] args) {
		
//	1] IF-ELSE-->The if statement executes a block of code only if the specified condition is true.
		int a=5;
		if(a<2 && a>1) {
			System.out.println("Yes");
		}else {
			System.out.println("NO");
		}
		System.out.println("________________");
	
//	2]ELSE-IF-->The else-if ladder is used to test multiple conditions. 
//		        Java checks each condition from top to bottom and executes the first block whose condition is true.
		
		if(a==2) {
			System.out.println("Matched1");
		}
		else if(a>=5) {
			System.out.println("Matched2");

		}
		else if(a!=5) {
			System.out.println("Matched3");

		}
		else {
			System.out.println("Not Match");
		}
		
		System.out.println("________________");
		
		
		
//	3]What is a Nested if-else Statement?
//	-->	A nested if means placing one if statement inside another if statement.
		
	int age = 25;
	boolean hasLicense = false;

		if(age >= 18) {

		    if(hasLicense) {
		        System.out.println("Can drive");
		    }
		    else {
		    	System.out.println("Can't Drive");
		    }
		}else {
			System.out.println("Your Not elligible");
		}
		System.out.println("________________");
		
		
//	4]What is a switch Statement?
//		--> A switch statement selects one block of code to execute from multiple options based on the value of an expression.
//		--> one Variable multiple condition
		int day = 2;

		switch(day) {

		    case 1:
		        System.out.println("Monday");
		        break;

		    case 2:
		        System.out.println("Tuesday");
		        break;

		    case 3:
		        System.out.println("Wednesday");
		        break;

		    default:
		        System.out.println("Invalid Day");
		}
		
//	5]Break:--> Break stops the Loop 
//	5]Continue:--> Continue Skip Iteration
		
		
	}
}
