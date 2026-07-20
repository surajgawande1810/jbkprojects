package Home_work;

public class Shopping_cart {
//	16. Shopping Cart
//	Create Cart:
//	Constructor â†’ item price & quantity
//	Method â†’ calculate total bill
//	Add discount if total > 5000
	Double Price;
	Double quantity;
	Double disc;
	Double Total=0.0;
	public Shopping_cart(Double Price,Double quantity,Double disc) {
		this.Price=Price;
		this.quantity=quantity;
		this.disc=disc;
	}
	public double Bill() {
		Total =Price*quantity;
		if (Total>=5000) {
			Double bill=Total*disc;
			Total-=bill;
			return Total;
		}
		else {
			return Total;
		}
	}
}
