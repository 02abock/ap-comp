
public class SavingsAcountTester {
  public static void main(String arg[]){
  
	  SavingsAcocount testAccount= new SavingsAcocount(10000,.10);
	  testAccount.addInterest();
	  System.out.println(testAccount.getBalance());
  }
  }