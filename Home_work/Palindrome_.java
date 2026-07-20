package Home_work;

public class Palindrome_ {

//12. Palindrome Check
//Create class:
//Constructor â†’ number
//Method â†’ check palindrome
	String name;
	String Reverse="";
	public Palindrome_(	String name) {
		this.name=name;
	}
	public boolean Palin() {
		int low=0;
		int high=name.length()-1;
		while (low<=high) {
			
			if (name.charAt(low)!=name.charAt(high)) {//m,ma,a,d
				return false;
				
			}
			low++;
			high--;

		}
		return true;
	}
}
