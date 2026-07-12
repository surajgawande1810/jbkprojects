package FromStarting;

public class Operator_ {
//	Operator is used to  perform an  Operation on one or more operands to produce result
	public static void main(String[] args) {
		
//1]Arithmetic Operators:
//	1)Addition= "+"
//	2)Subtraction= "-"
//	3)Multiplication= "*"
//	4)Division(Quotient)= "/"
//	5)modules(Remainder)= "%"
		int a = 20;
		int b = 6;
		System.out.println(a + b); // 26
		System.out.println(a - b); // 14
		System.out.println(a * b); // 120
		System.out.println(a / b); // 3
		System.out.println(a % b); // 2
		System.out.println("----------------------");

//2]Assignment Operators
//	1)Addition Equals to= "+=" (Add AND Assign)
//	2)Subtraction  Equals to= "-=" (Sub AND Assign)
//	3)Multiplication  Equals to= "*=" (Mul AND Assign)
//	4)Division(Quotient)  Equals to= "/=" (Div AND Assign)
//	5)modules(Remainder)  Equals to= "%=" (Mod AND Assign)
//	6)Equals to= "="
		int u = 10;
		u += 5;
		System.out.println(u); //15
		System.out.println("----------------------");
		
		
//3]Relational (Comparison) Operators
//		1)Double Equals To = "=="
//		2)Not Equals To = "!="
//		3)Greater than = ">"
//		4)Less than = "<"
//		5)Greater than Equals to = ">="
//		6)less than Equals to = "<="
		int d = 10;
		int c = 20;
		System.out.println(c<d); //true
		System.out.println(c == d); //false
		System.out.println("----------------------");

		//4]Logical Operators
//		1)Logical AND (&&)-->Both conditions are true Then statement is True:  
//		Example:
		int age1 = 20;
		System.out.println(age1 > 18 && age1 < 30);
		
		
//		1)Logical NOT (!)--> it change true-->false and vice versa;
		int age = 20;
		System.out.println(!(age > 18 && age < 30));
		System.out.println("----------------------");
		
//5]Bitwise Operators
//		1)Bitwise AND (&)--> Sets a bit to 1 only if both corresponding bits are 1.
				//		  0101
//	explanation			& 0011
				//		------
				//		  0001
//		
//		
		int e = 5;   // 0101
		int f = 3;   // 0011

		System.out.println(e & f);
//		1)Bitwise XOR (^)-->Returns 1 if at least one bit is 1.
		int g = 5;   // 0101
		int h = 3;   // 0011
		System.out.println(g | h);
		System.out.println("----------------------");

		
//6]Increment & Decrement
		int l = 10;

		l++;
//		++l;
		System.out.println(l); //11

		l--;
//		--l;
		System.out.println(l); //10
		
		
		
		
}
}
