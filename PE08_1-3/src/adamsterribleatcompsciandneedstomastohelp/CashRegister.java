package adamsterribleatcompsciandneedstomastohelp;


import java.util.logging.Logger;

/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{

   private double purchase;
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
      Logger.getGlobal().info("amount=" + amount);
   }
   
   /**
      Enters the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   public void enterPayment(int coinCoint, money coinType)
   {
      payment = coinCoint *(coinType.getValue());
      }
 
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public int giveChange(money Type)
   {
      change = (int)((payment - purchase)*100);
      purchase = 0;
      payment = 0;
      int toReturn = change/(int)Type.getValue();
      change=change%(int)Type.getValue();
      payment=(double)change/100;
      return toReturn;
      
   }
   private int change;
}

