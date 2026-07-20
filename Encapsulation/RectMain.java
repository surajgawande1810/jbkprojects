package Encapsulation;

public class RectMain {
public static void main(String[] args) {
	Rectangle re=new Rectangle();
	re.setLength(5);
	re.setWidth(10);
	System.out.println("Area of Reactangle: "+re.getLength());
	System.out.println("perimeter of rectangle: "+re.getWidth());
}
}
