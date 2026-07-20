package Home_work;

public class Std_grade {
//	10. Student Grade
//	Create Student:
//	Constructor â†’ marks
//	Method â†’ return grade (A/B/C/Fail
	int marks;
	public Std_grade(int marks) {
		this.marks=marks;
	}
	public char Grade() {
		if (marks<=100 && marks>=80) {
			return 'A';
		}
		else if (marks<=80 && marks >=60) {
			return 'B';
		}
		else if (marks<=60 && marks >=35) {
			return 'C';
		}
		else   {
			return 'F';
		}
		
		
	}
}
