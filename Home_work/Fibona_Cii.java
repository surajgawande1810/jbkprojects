package Home_work;

public class Fibona_Cii {
//	18. Fibonacci Series
//	Create class:
//	Constructor â†’ number of terms
//	Method â†’ print Fibonacci series
	int firstnum=0;
	int secondnum=1;
	int Num;
	public Fibona_Cii(int Num) {
		this.Num=Num;
	}
	public void Fibo() {
		for(int i=1;i<=Num;i++) {
			System.out.print(firstnum+" ");
			int next=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=next;
		}
	
		
	}
}
