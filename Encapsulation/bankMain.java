package Encapsulation;

public class bankMain {
public static void main(String[] args) {
	Bank B=new Bank();
	B.setBalance(50000);
	B.setDeposit(50000);
	B.setWithdraw(40000);
	System.out.println(B.getDeposit());
	System.out.println(B.getWithdraw());
	System.out.println(B.getBalance());
}
}
