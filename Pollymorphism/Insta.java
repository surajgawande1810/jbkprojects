package Pollymorphism;

public class Insta {
//	. Overload a method login() with:
//		username
//		username and password
	
	public void login(String username) {
		System.out.println(username);
	}
	
	public void login(String username,String pass) {
		System.out.println(username + pass);
	}
}
