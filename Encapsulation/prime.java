package Encapsulation;

public class prime {
private int number;
int count=0;
public String getNumber() {
	for(int i=1;i<= number;i++) {
		if (number%i==0) {
			 count++;
		}
	}
		if(count==2) {
			return "Num is prime";
		}
		else {
			
			return "Not prime";
		}
}

public void setNumber(int number) {
	this.number = number;
}
}
