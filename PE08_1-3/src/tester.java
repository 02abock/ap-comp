import adamsterribleatcompsciandneedstomastohelp.CashRegister;

import adamsterribleatcompsciandneedstomastohelp.money;

public class tester{
	public static void main(String []args){
		CashRegister tester = new CashRegister();
		money penny =new money(.01,"penny");
		money nickel=new money(.05,"nickel");
		tester.enterPayment(5, penny);
		System.out.println(tester.giveChange(nickel));
		
	}
}