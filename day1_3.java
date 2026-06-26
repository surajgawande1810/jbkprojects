package myproject2026;

public class day1_3 {
public static void main(String[] args) {
	char op='+';
	int a=2,b=3;
	switch(op) {
	case '+' -> System.out.println("Addition of "+a+"+"+b +"="+(a+b));
	case '-' -> System.out.println("sub of "+a+"-"+b +"="+(a-b));
	case '*'-> System.out.println("mul of "+a+"*"+b +"="+(a*b));
	case '/' -> System.out.println("div of "+a+"/"+b +"="+(a/b));
	case '%' -> System.out.println("mod of "+a+"%"+b +"="+(a%b));
	
    default -> System.out.println("Invalid num");
	}
}
}

