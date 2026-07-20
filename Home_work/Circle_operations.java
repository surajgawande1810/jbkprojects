package Home_work;

public class Circle_operations {
	double Radius;
	
public Circle_operations(double Radius) {
	this.Radius=Radius;
}
public double Area() {
	Double area=3.14*Radius*Radius;
	return area;
}
public double Circum() {
	Double circum=2*3.14*Radius;
	return circum;
	
}
	
}
