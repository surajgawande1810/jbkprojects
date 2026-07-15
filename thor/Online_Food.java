package com.thor;

import java.util.*;

public class Online_Food {
//	Food Ordering App
//	Method placeOrder(String item, int quantity) that prints bill.
	String item;
	int Quantity;

	public int Place_Order(String item, int Quantity) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price : ");
		int price = sc.nextInt();
		int bill = price * Quantity;

		return bill;
	}

}
