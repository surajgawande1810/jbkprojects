package Encapsulation;

public class Rectangle {
//	Rectangle
//	Private fields: length and width. Set values using setters and calculate area and perimeter.
	private double length;
	private double width;
	public double getLength() {
		double area=length*width;
		return area;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		double perimeter=2*(length+width);
		return perimeter;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
}
