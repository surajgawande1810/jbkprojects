package Encapsulation;

public class Std {
//	Student Class
//	Private fields: name, rollNo, marks. Use getters/setters and display student details.
	private String name;
	private int rollno;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getMarks() {
		if (marks>=35) {
			return "Pass";
		}
		else {
			return "Fail";
		}
		
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
