package Home_work;

public class Employee_Sal {
//	3. Employee Salary
//	Create Employee:
//	Constructor â†’ name, basicSalary
//	Method â†’ calculate total salary (add 20% bonus)
	String name;
	Double Salary;
	Double Bonus;
	public Employee_Sal(String name,Double Salary,Double Bonus) {
		this.name=name;
		this.Salary=Salary;
		this.Bonus=Bonus;
	}
	public Double Cal() {
		Bonus=Salary*Bonus;
		if(Salary>=50000) {
			return Salary+Bonus;
		}
		else {
			return Salary;
		}
	}
	
	
	
}
