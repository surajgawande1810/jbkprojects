package Encapsulation;

public class AtmMain {
public static void main(String[] args) {
	Atm atm=new Atm();
	atm.setPin(1234);
	System.out.println(atm.getPin());
}
}
