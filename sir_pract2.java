package Practisenew;
import java.util.*;
public class sir_pract2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int choice;
	        double price, discount = 0, finalAmount;
	        char student;

	        System.out.println("1. Silver - Rs.100");
	        System.out.println("2. Gold - Rs.200");
	        System.out.println("3. Platinum - Rs.300");

	        System.out.print("Enter Ticket Choice: ");
	        choice = sc.nextInt();

	        if (choice == 1) {
	            price = 100;
	        } 
	        else if (choice == 2) {
	            price = 200;
	        } 
	        else if (choice == 3) {
	            price = 300;
	        } 
	        else {
	            System.out.println("Invalid Choice!");
	            return;
	        }

	        System.out.print("Are you a Student? (Y/N): ");
	        student = sc.next().charAt(0);

	        if (student == 'Y' || student == 'y') {
	            discount = price * 0.10;
	        }

	        finalAmount = price - discount;

	        System.out.println("Ticket Price = Rs." + price);
	        System.out.println("Discount = Rs." + discount);
	        System.out.println("Final Amount = Rs." + finalAmount);

	        sc.close();
	    }
	}