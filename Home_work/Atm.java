package Home_work;

public class Atm {
//	15. ATM Machine Simulation
//	Create ATM:
//	Constructor â†’ initial balance
//	Methods:
//	deposit
//	withdraw
//	check balance
//	Add condition for insufficient balance
	int Pin;
	long Balance;
	long depo;
	long with;

	public Atm(int Pin, long Balance, long depo, long with) {
		this.Balance = Balance;
		this.depo = depo;
		this.Pin = Pin;
		this.with = with;
	}

	public Boolean PIN() {
		if (Pin == 1234) {
			System.out.println("Pin Is Correct");
			return true;
		} else {
			return false;
		}
	}

	public long Deposit() {
		Balance += depo;
		return Balance;
	}

	public long withdrwal() {
		if (Balance>=with) {
			Balance-=with;
			return Balance;
			}
		else {
			System.out.println("Insufficient Balance");
			return Balance; 
		}
	}
	public long CheckBalance() {
		return Balance;
	}

}
