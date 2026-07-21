package Pollymorphism;

public class add {
//	1.Create a class Calculator and overload add() to add:
//		two integers
//		three integers
	
	public void Add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void Add(double a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	
//	5.Overload sum() using different data types:
//		sum(int, int)
//		sum(float, float)
	
	public void Add(int a,double b) {
		System.out.println(a+b);
	}
	
	public void Add(float a,float b) {
		System.out.println(a+b);
	}
}
