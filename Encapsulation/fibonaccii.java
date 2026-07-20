package Encapsulation;

public class fibonaccii {
private int num;
int first=0;
int second=1;

public void getNum() {
	for(int i=1;i<=num;i++) {
		System.out.print(first+" ");
		int next =first+second;
		first=second;
		second=next;
		
	}	
}

public void setNum(int num) {
	this.num = num;
}

}
