package Pollymorphism;

public class StaticMain {
public static void main(String[] args) {
	Static st=new Static();
	System.out.println(st.main(5));
	System.out.println(st.main(5,10));
	st.main(5.5, 15);
}
}
