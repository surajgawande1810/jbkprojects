package Encapsulation;

public class circle {
private float radius;

public float getRadius() {
	return radius;
}

public void setRadius(float radius) {
	this.radius = radius;
}
public float area() {
	float area = (float) (3.14*radius*radius);
	return area;
}
public float circumference() {
	float Circumference=(float) (2*3.14*radius);
	return Circumference;
}

}
