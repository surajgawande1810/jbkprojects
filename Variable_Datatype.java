package FromStarting;

public class Variable_Datatype {
	public static void main(String[] args) {
		
//What IS VARIABLE ?
//	-->A variable is a named memory location used to store data. 
//	-->The value of a variable can change during program execution
//	example-->age is an variable...
		int age=25;
		System.out.println("My Age Is: "+(age));

//		Two Types Of Variable: 
//		--> 1]Local Variable:
//					Declared inside a method.
//					Accessible only within that method.
//					No default value.
//		-->2]Global variable:
//					Declared inside of class and out side of Method.
//					it can access anywhere.
		
//What is a data type in Java?
//		-->A data type specifies the type of data a variable can hold.
//		-->The size of memory allocated.
//		-->The range of values that can be stored.
//		-->The operations that can be performed on the data.
		
//		**]TWO TYPES OF DATATYPE{
//		1]Primitive Data Types:
//		  				default values below;   	size:
//		1)byte -->		0							1
//		2)Short -->		0							2
//		3)int -->		0							4
//		4)long -->		0							8
//		5)float -->		0.0							4
//		6)double -->	0.0							8
//		7)char -->		" "-->white space			2
//		8)boolean -->	False						true/false
//		
//		2]Non-Primitive (Reference) Data Types:
//		1)String 		null
//		2)Array			null
//		3)Classes		null
//		4)Object		null
//		4)Interfaces	null
//		}
//example:  
		int price=250;
		System.out.println("The price Is: "+(price));

	}
}
