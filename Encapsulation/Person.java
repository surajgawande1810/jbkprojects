package Encapsulation;

public class Person {
//	Question:
//	Create a class Person with private variables name and age.
//	Add setter and getter methods.
//	Create an object and print the name and age.
	
	private String name;
	private int age;
	
	public void setName(String name){
		this.name=name;
	}
		
	public String getName() {
		return "name";
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge() {
		return age ;
	}
}
