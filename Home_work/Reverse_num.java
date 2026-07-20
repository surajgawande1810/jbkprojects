package Home_work;

public class Reverse_num {
//	11. Number Reverse
//	Create class:
//	Constructor â†’ number
//	Method â†’ reverse number
	int Num;
	int reverse=0;
	public Reverse_num(int Num) {
		this.Num=Num;
	
	}
	public int Numbr() {
		while(Num!=0) {
		int digit =Num%10;
		reverse=reverse*10+digit;
		Num/=10;}
		return reverse;
	}
}
