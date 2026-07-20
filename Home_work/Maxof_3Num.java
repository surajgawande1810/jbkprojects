package Home_work;

public class Maxof_3Num {
//	14. Max of Three Numbers
//	Create class:
//	Constructor â†’ 3 numbers
//	Method â†’ find largest
	int Num1;
	int Num2;
	int Num3;

	public Maxof_3Num(int Num1, int Num2, int Num3) {
		this.Num1 = Num1;
		this.Num2 = Num2;
		this.Num3 = Num3;
	}

	public int Checking() {
		if (Num1 >= Num2 && Num1 >= Num3) {
			return Num1;
		} else if (Num2 >= Num1 && Num2 >= Num3) {
			return Num2;
		} else {
			return Num3;
		}
	}
}
