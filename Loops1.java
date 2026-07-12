package FromStarting;

public class Loops1 {
//FOR-->WHILE-->DO_WHILE-->NESTED LOOPS ALL
	public static void main(String[] args) {
		
//	1}**FOR--->for(initialization; condition; increment/decrement) 
//    --> for loop used when we know starting point and ending point....
		
	     for(int i = 1; i <= 5; i++) {
	            System.out.println(i);
	        }
	System.out.println("_____________________");
	
//	2}**while--->
//	A while loop executes the block of code as long as the condition is true.
//	It is generally used when the number of iterations is not known.
    int k=4;
	while(k <= 5) {
        System.out.println(k);
        k++;
	}
        System.out.println("_____________________");
        
//	3}**Do-While--->
//   A do-while loop executes the loop body at least once, even if the condition is false
        int u = 1;

        do {
            System.out.println(u);
            u++;
        } while(u <= 5);
	System.out.println("_____________________");
	
	}
	
}

