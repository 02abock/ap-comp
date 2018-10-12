public class SavingsAcocount {
	
	public SavingsAcocount (double initialBalance, double initialIntrest)
	{
		balance= initialBalance;
		intrest= initialIntrest;
	}public  SavingsAcocount ()
	{
		balance= 0;
		intrest=.10;
	}
	public void dposit(double amount)
	{
		balance+= amount;
	}public void withdraw(double amount)
	{
		balance-= amount;
	}
	public double getBalance()
	{
		return balance;
	}
	public void addInterest()
	{
		balance+=(balance*intrest);
	}
	
	
	double balance;
	double intrest;
	}
	