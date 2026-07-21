package Pollymorphism;

public class std {
//	. Overload a constructor in a Student class to initialize:
//		default values
//		only id
//		id and name
	
	public void student(int id) {
		System.out.println(id);
	}
	
	
	public void student(int id,String name) {
		System.out.println(id+name);
	}
}
