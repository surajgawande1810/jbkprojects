package Encapsulation;

public class Circlemain {
public static void main(String[] args) {
	circle cir=new circle();
	cir.setRadius(5);
	System.out.println("Area Of Circle: "+cir.area());
	System.out.println("Circumference Of Circle: "+cir.circumference());
}
}
