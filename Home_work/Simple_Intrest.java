package Home_work;

public class Simple_Intrest {
//	5. Simple Interest
//	Create Interest class:
//	Constructor â†’ principal, rate, time
//	Method â†’ calculate SI
	Double Principle;
	Double Intrest;
	Double time;
	public Simple_Intrest(Double Principle,Double Intrest,Double time) {
		this.Principle=Principle;
		this.Intrest=Intrest;
		this.time=time;
	}
	public double Si() {
//		Double inte=Intrest*time;
		Double Total =(Principle*Intrest*time)/100;
		return Total;
	}
}
