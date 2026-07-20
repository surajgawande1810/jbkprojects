package Home_work;

public class Even_Odd {
//	6. Even or Odd
//	Create class:
//	Constructor â†’ number
//	Method â†’ check even/odd
	int num;
	public Even_Odd(int num) {
		this.num=num;
	}
	public String Check () {
		if(num%2==0){
		return "even";	
		}
		else {
			return "odd";
		}
	}
}
		
		
