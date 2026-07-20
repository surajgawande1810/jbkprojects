package Home_work;

public class Bank_Acc {
//	8. Bank Account
//	Create BankAccount:
//	Constructor â†’ accountNumber, balance
//	Methods:
//	deposit()
//	withdraw()
//	displayBalance()
	long Acc_num;
	long Balance;
	long Amt;
	long with_Amt;
	
	public Bank_Acc(long Acc_num,long Balance,long Amt,long with_Amt) {
		this.Acc_num=Acc_num;
		this.Balance=Balance;
		this.Amt=Amt;
		this.with_Amt=with_Amt;
	}
		public long Deposit() {
			Balance+=Amt;
			return Balance ;
		}
			public long Withdraw() {
				if (Balance> with_Amt) {
				Balance-=with_Amt;
				return Balance;}
				else {
					return Balance;
				}
			}
	public long DisplayBalance() {
		
		return Balance;
	}
}
