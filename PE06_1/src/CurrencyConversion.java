import java.util.Scanner;
public class CurrencyConversion{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String enteredValue = null;
		Double conversionRate;
		int tester=0;
		
		System.out.println("Please enter conversion rate");
		conversionRate=sc.nextDouble();
		System.out.println("Enter a amount in US dollars to be converted to Euroes. Or enter q to stop.");
		while(tester==0) {
			enteredValue=sc.next();
			if(!(enteredValue.equals("q"))) {
 				System.out.println("In Euroes"+Double.parseDouble(enteredValue)*conversionRate);
			}
			else {
				tester=1;
			}
		}
	}
}