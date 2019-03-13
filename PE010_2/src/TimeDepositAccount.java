public class TimeDepositAccount extends  BankAccount{
	public TimeDepositAccount(double initialBalance, double givenIntrestRate)
    {  
		super(initialBalance);
		monthspassed=0;
		intrestRate=givenIntrestRate;
   }
	public void addInterest() {
		double Intrest =getBalance()*intrestRate;
		deposit(Intrest);
		monthspassed++;
	}
	public void withdrawl(double toWithdrawl) {
		if (monthspassed<5) {
			withdraw(100);
			System.out.println("a fine was applied");
		}
		withdraw(toWithdrawl);
	}
	int monthspassed;
	double intrestRate;
}