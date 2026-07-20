package Home_work;

public class Prime_num {
//	19. Prime Number Check
//	Create class:
//	Constructor â†’ number
//	Method â†’ check prime
	int Num;
	int Count = 0;

	public Prime_num(int Num) {
		this.Num = Num;
	}

	public Boolean yes_no() {
		for (int i = 1; i < Num; i++) {
			if (Num % i == 0) {
				Count++;
				}
		}
			if(Count==1) {
				return true;
			}
			else {
				return false;
			}
	}
}
