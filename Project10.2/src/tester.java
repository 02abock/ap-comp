public class tester {
   public static void main(String[] args)
   {
      SavingsAccount oneS = new SavingsAccount(5);
      CheckingAccount oneC = new CheckingAccount(100); 
      SavingsAccount twoS = new SavingsAccount(233);
      oneS.deposit(34234);  
      oneS.clone(twoS);
      System.out.println(oneS.toString());
      System.out.println(twoS.equals(oneS)); 
      System.out.println(oneC.toString());
      
   }
}