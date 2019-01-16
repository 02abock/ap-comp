import java.util.ArrayList;

public class purseTester{
	public static void main(String []args) {
	Purse tester2= new Purse();
	Purse tester = new Purse();
	tester.addCoin("penny");
	tester.addCoin("Nickle");
	System.out.println(tester.getArray());
	tester.reverse();
	System.out.println(tester.getArray());
	tester2.addCoin("dollarCoin");
tester2.transfer(tester);
System.out.println("has same contents"+tester.sameContents(tester2));

tester2.addCoin("penny");
tester2.addCoin("Nickle");
System.out.println("has same coins"+tester.sameCoins(tester2));
System.out.println(tester.getArray());
System.out.println(tester2.getArray());


	}
}