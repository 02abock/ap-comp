public class CashRegisterEnhanced3 {
	
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

	private double purchase;
	private double payment;
	private int itemCount;
	
	CashRegisterEnhanced3() {
      purchase = 0;
      payment = 0;
      itemCount = 0;
   }

   public void recordPurchase(double amount) {
      purchase = purchase + amount;
      itemCount ++;
   }
   

   public void enterPayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies) {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
   }
   
   public void enterDollars(int dollars) {
	   payment += dollars;
   }
   
   public void enterQuarters(int quarters) {
	   payment += quarters * QUARTER_VALUE;
   }
   
   public void enterDimes(int dimes) {
	   payment += dimes * DIME_VALUE;
   }
   
   public void enterNickels(int nickels) {
	   payment += nickels * NICKEL_VALUE;
   }
   
   public void enterPennies(int pennies) {
	   payment += pennies * PENNY_VALUE;
   }
   
   public double giveChange() {
      double change = payment * 10 - purchase * 10;
      purchase = 0;
      payment = 0;
      return Math.round(change * 10) * .01;
   }
   
   public int getItemCount() {
	   return itemCount;
   }
   
   public int giveDollars() {
	   payment -= purchase;
	   int dol = (int) payment;
	   payment -= dol;
	   return dol;
   }
   
   public int giveQuarters() {
	   int quat = (int) (payment/QUARTER_VALUE);
	   payment -= quat * QUARTER_VALUE;
	   return quat;
   }
   
   public int giveDimes() {
	   int dime = (int) (payment/DIME_VALUE);
	   payment -= dime * DIME_VALUE;
	   return dime;
   }
   
   public int giveNickels() {
	   int nick = (int) (payment/NICKEL_VALUE);
	   payment -= nick * NICKEL_VALUE;
	   return nick;
   }
   
   public int givePennies() {
	   int pen = (int) (payment/PENNY_VALUE);
	   payment -= pen * PENNY_VALUE;
	   return pen;
   }
   
}