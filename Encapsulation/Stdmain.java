package Encapsulation;

public class Stdmain {
public static void main(String[] args) {
	Std std=new Std();
	std.setName("Suraj");
	std.setRollno(45);
	std.setMarks(100);
	System.out.println(std.getName());
	System.out.println(std.getRollno());
	System.out.println(std.getMarks());
}
}
