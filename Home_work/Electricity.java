package Home_work;

public class Electricity {

//17. Electricity Bill
//Create ElectricityBill:
//Constructor â†’ units
//Method â†’ calculate bill:
//0â€“100 â†’ â‚¹5/unit
//101â€“200 â†’ â‚¹7/unit
//200+ â†’ â‚¹10/unit
	int rate ;
	int units;
	public Electricity(int units,int rate) {
	this.rate=rate;
	this.units=units;
	
	}
	public int ElecBill() {
		if(units<=100) {
			return rate;
		}
		else if(units<=200) {
			rate+=2;
			return rate;
					
		}
		else {
			rate+=5;
			return rate;
		}
	}
}
