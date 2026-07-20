package Encapsulation;

import java.util.*;

public class Atm {
//	ATM Machine
//	Private PIN field. Create validatePin(int pin) and allow balance check only if the PIN is correct.
	private int pin;
	int count = 0;
	Scanner sc = new Scanner(System.in);

	public String getPin() {
		while (pin != 1234) {
			System.out.println("invalid pin enter pin");
			pin=sc.nextInt();
			count++;
			if(count>=3) {
				return "pin stopeed";
			}else{
				if(pin==1234) {
					return "correct pin Check Balance";
				}
				
			}
		}
		return"Correct pin Check Balance....!";
		}
		

	public void setPin(int pin) {
		this.pin = pin;
	}

}
