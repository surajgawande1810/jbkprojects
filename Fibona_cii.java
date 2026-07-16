package Dr_Doom;

public class Fibona_cii {
public static void main(String[] args) {
	int firstnum=0,secondnum=1;
	for(int i=0;i<=10;i++) {
		System.out.print(firstnum+" ");
		int count=firstnum+secondnum;//count=0+1-->count=1//
		firstnum=secondnum;// 0=1-->firstnum=1;
		secondnum=count;// 1=1-->secondnum=1
	}
}
}
