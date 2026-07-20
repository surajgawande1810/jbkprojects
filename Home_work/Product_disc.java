package Home_work;

public class Product_disc {
//	9. Product Discount
//	Create Product:
//	Constructor â†’ price
//	Method â†’ apply 10% discount if price > 1000
	double price;
	double discount;

	public Product_disc(double price, double discount) {
		this.price = price;
		this.discount = discount;
	}

	public double disc() {
		if (price >= 1000) {
			discount = price * discount;
			price -= discount;
			return price;
		} else {
			return price;
		}

	}
}
