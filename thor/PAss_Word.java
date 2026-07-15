package com.thor;

import java.util.Scanner;

public class PAss_Word {
//	Password Strength Checker
//	Method checkPassword(String password) → return strong/weak.
	Scanner sc = new Scanner(System.in);
//String userpass="Suraj@7517";
	public String Checkpass() {
		System.out.println("Enter Your Password : ");
		String Pass = sc.nextLine();
          if(Pass.length()<=6 ) {
        	  return "Weak";
        	  
          }
          else {
        	  return "Strong";
          }
	}

}
