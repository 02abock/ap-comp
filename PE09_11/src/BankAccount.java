import java.util.Formattable;
import java.util.Formatter;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount implements Formattable
{  
	int w = 10;
	private String t = "";
	Formatter k;
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
	   
      balance = initialBalance;
      
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
	   
      return balance;
   }

   private double balance;


public void formatTo(Formatter fmt, int flags, int width, int precision) {
	StringBuilder sb = new StringBuilder();
	t = Double.toString(balance);
	int len = sb.length();
	if (len < width)
		 for (int i = 0; i < width - len; i++)
        {
        	sb.append(' ');
        	
        }
	int y = t.length();
	sb.delete(0, y);
	sb.insert(sb.length(), balance);
	
	System.out.print(sb.toString());
	
	
}

}

