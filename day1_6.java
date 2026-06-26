package myproject2026;

import java.util.*;

public class day1_6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select Category:Domestic,Commercial,Industrial ");
		System.out.println("Enter Area To Find Electricity Rate: ");
		String area = sc.next();

		switch (area) {
		case "Domestic" -> System.out.println("Electricity bill per unit = 5");
		case "Commercial" -> System.out.println("Electricity bill per unit = 4");
		case "Industrial" -> System.out.println("Electricity bill per unit = 12");
		default -> System.out.println("No area found");

		}
	}
}
