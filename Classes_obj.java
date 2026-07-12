package FromStarting;

public class Classes_obj {
	
//What is Classes ?
//-->	1]A class is a blueprint or template for creating objects
//-->	2]It defines the properties (variables) and behaviors (methods) that objects of that type will have
	
//	NOTE:--> We can Create A Class And Access In Main Method.Like Below Example.
//	we create A class Named as Car and we access it uin our main method.
	
//	Example --->i create a class in our Package  we can access it here;i create a car class:
	public static void main(String[] args) {
		Car RangeRower=new Car();
		RangeRower.Mycar();
		System.out.println("Name Of Car: "+(RangeRower.name="RangeRower"));
		System.out.println("Model: "+(RangeRower.model=2026));
		System.out.println("Price: "+(RangeRower.price=20000000));
	
	
//What is OBJECT ?
//-->	1]An object is an actual instance of a class
//-->	2]When you create an object, memory is allocated for its variables, and you can use its methods.
//		Car RangeRower=new Car();
//		RangeRower.Mycar();
		
//		RangeRower it is a object 
	}
}