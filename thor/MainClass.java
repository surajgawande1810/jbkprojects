package com.thor;

public class MainClass {
public static void main(String[] args) {
	Student std =new Student();
	std.Display();
	System.out.println(std.Marks=45);
	System.out.println(std.name="Suraj");
	System.out.println(std.rollNo=45);
	System.out.println("_____________________________________");
	
	Student SC =new Student();
	SC.Display();
	System.out.println(SC.Marks=264);
	System.out.println(SC.name="Suraj");
	System.out.println(SC.rollNo=28);
	System.out.println("_____________________________________");
	
	
	Employee Em =new Employee();
	Em.ShowDetails();
	System.out.println(Em.name="Suraj");
	System.out.println(Em.salary=250000);
	System.out.println("_____________________________________");
	
	Car c =new Car();
	c.ShowCar();
	System.out.println(c.clr="Black");
	System.out.println(c.engineCC=500);
	System.out.println(c.modelYr=2026);
	System.out.println("_____________________________________");
	
	Mobile Oppo =new Mobile();
	Oppo.DisplaySpec();
	System.out.println("OPPO");
	System.out.println(Oppo.price=25000);
	System.out.println(Oppo.ram=4);
	System.out.println("_____________________________________");
	
	
	Rectangle Rec =new Rectangle();
	Rec.Calculate();
	System.out.println("REC");
	System.out.println(Rec.length=4);
	System.out.println(Rec.width=4);
	System.out.println((Rec.length)*(Rec.width));
	System.out.println("_____________________________________");
	
	Circle Cir =new Circle();
	Cir.Area();
	System.out.println("Circle");
	System.out.println(Cir.radius=5);
	System.out.println((Cir.radius)*(Cir.radius)*(3.14));
	System.out.println("_____________________________________");
	
	BankAcc User =new BankAcc();
	User.DisplayBalance();
	System.out.println("My Account NUM Is: "+(User.accNo=252124564));
	System.out.println("My Balance Is: "+(User.balance=254123625));
	System.out.println("_____________________________________");

}
}
