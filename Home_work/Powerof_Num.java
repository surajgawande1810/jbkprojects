package Home_work;

public class Powerof_Num {
//	13. Power Calculation
//	Create class:
//	Constructor â†’ base, exponent
//	Method â†’ calculate power without using Math.pow()
	int base;
	int index;
	int Count=1;
	public Powerof_Num(int base,int index) {
		this.base=base;
		this.index=index;
	}
	public int Power() {
		for(int i=1;i<=index;i++) {//1-->4index
			Count*=base;
		}
		return Count;
	}
}
