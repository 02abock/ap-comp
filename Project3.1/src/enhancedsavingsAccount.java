import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class enhancedsavingsAccount {
	
	public enhancedsavingsAccount (double initialBalance, double initialIntrest, double intialFee,int MonthlyFreeTranscations)
	{
		balance= initialBalance;
		intrest= initialIntrest;
		fee=intialFee;
		freeTransactions=MonthlyFreeTranscations;
		formattedDate=formatter.format(LocalDate.now());
		freeTransactionsResseter=MonthlyFreeTranscations;

	}public  enhancedsavingsAccount ()
	{
		balance= 0;
		intrest=.10;
		fee=.10;
		
	}
	public enhancedsavingsAccount (double initialBalance)
	{
		balance= initialBalance;
	}
	public void deposit(double amount)
	{
		if (formattedDate==formatter.format(LocalDate.now())) {
		
if (freeTransactions<=0){
	balance+= amount;
	
	
	balance-=fee;
		}
else {
	balance+= amount;
	freeTransactions-=1;

}
}
		else {
			freeTransactions=freeTransactionsResseter;
			balance+= amount;
			freeTransactions-=1;
		}
	}
		
		
	public void withdraw(double amount)
	{
		if (formattedDate==formatter.format(LocalDate.now())) {
			
			if (freeTransactions==0){
				balance-= amount;
				
				
				balance-=fee;
					}
			else {
				balance-= amount;
				freeTransactions-=1;

			}
			}
					else {
						freeTransactions=freeTransactionsResseter;
						balance-= amount;
						freeTransactions-=1;
					}
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
	private int freeTransactionsResseter;
	private String formattedDate;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
	}
	