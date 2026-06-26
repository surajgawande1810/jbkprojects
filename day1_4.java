package myproject2026;

public class day1_4 {
public static void main(String[] args) {
	String grade= "A";
	switch(grade) {
	case "A" -> System.out.println("EXCELLENCE");
	case "B" -> System.out.println("GOOD");
	case "C" -> System.out.println("AVG");
	case "D" -> System.out.println("POOR");
	case "F" -> System.out.println("FAIL");
    default -> System.out.println("Invalid GRADE");
	}
}
}

