public class SavingsAcocount {
	
	public SavingsAcocount (double initialBalance, double initialIntrest, double intialFee)
	{
		balance= initialBalance;
		intrest= initialIntrest;
		fee=intialFee;
	}public  SavingsAcocount ()
	{
		balance= 0;
		intrest=.10;
		fee=.10;
	}
	public SavingsAcocount (double initialBalance)
	{
		balance= initialBalance;
	}
	public void deposit(double amount)
	{
		balance+= amount;
		balance-=fee;
		
	}public void withdraw(double amount)
	{
		balance-= amount;
		balance-=fee;
	}
	public double getBalance()
	{
		return balance;
	}
	public void addInterest()
	{
		balance+=(balance*intrest);
	}
	
	
	private double balance;
	private double intrest;
	private double fee;
	private int freeTransactions;
	}
	