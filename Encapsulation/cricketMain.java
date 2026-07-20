package Encapsulation;

public class cricketMain {
public static void main(String[] args) {
	Cricket c=new Cricket();
	c.setMatches(200);
	c.setRuns(10000);
	System.out.println(c.avg());
}
}
