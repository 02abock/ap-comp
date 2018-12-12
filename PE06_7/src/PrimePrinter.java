import java.util.Scanner;
public class PrimePrinter {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to g o up to for prime numbers");
		PrimeGenerator pg = new PrimeGenerator(sc.nextInt());
		
		
		System.out.println("Number to find primes: " + pg.num);
		int old=pg.nextPrime();
		System.out.println(old);
		int new_=pg.nextPrime();
		while(old!=new_) {
			System.out.println(new_);
			old=new_;
			new_=pg.nextPrime();
		}
		System.out.println(pg.nextPrime());
		
	}
}