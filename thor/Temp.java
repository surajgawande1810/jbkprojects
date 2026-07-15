package com.thor;

import java.util.*;

public class Temp {
//	Temperature Converter
//	Create a method celsiusToFahrenheit(double c) and return converted value
	Scanner sc = new Scanner(System.in);
	

	public double Temp1() {
System.out.println("Enter Your Temp In Fahrenheit: ");
		double Tem = sc.nextDouble();
		Double Total=(Tem*1.8)+32;
		return Total;
	}
}