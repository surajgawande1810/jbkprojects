package Encapsulation;

public class Bank {
//	Create a BankAccount class with a private balance.
//	Add:
//	deposit(double amount)
//	withdraw(double amount)
//	getBalance()
	
	private double balance;
	private double deposit;
	private double withdraw;
	
	
	public double getDeposit() {
		balance+=deposit;
		return balance;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdraw() {
		balance-=withdraw;
		return balance;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	
	}
}
