package Encapsulation;

import java.util.Scanner;

public class PersonMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Name: ");
	String name=sc.nextLine();
	System.out.println("Enter Your age: ");
	int age=sc.nextInt();
	
	Person pr=new Person();
	pr.setName("name");
	pr.setAge(age);
	System.out.println(pr.getName());
	System.out.println(pr.getAge());
}
}
