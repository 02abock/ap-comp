
public class EnhancedSavingsAccountTester {
  public static void main(String arg[]){
  	
	  enhancedsavingsAccount tester= new enhancedsavingsAccount(5000, .03, 5,0);
	  tester.deposit(5);
	  tester.deposit(5);
	  tester.deposit(5);
	  System.out.print(tester.getBalance());
	  
  }
  }