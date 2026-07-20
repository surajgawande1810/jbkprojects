package Home_work;

public class Student_ {
//	Create a Student class:
//		Constructor initializes name, marks
//		Method to display result (Pass/Fail)
	String name;
	int Marks;
	public Student_(String name,int Marks) {
		this.name=name;
		this.Marks=Marks;
		
	
		if (Marks>=35) {
			System.out.println("Student Pass");
		}
		
		else {
			System.out.println("Sorryyy Student you are Failed ");
		}
		
	}
}
