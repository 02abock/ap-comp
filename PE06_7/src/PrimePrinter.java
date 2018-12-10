public class PrimePrinter {
	public static void main(String []args) {
		
		PrimeGenerator pg = new PrimeGenerator(20);
		
		
		System.out.println("Number to find primes: " + pg.num);
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
	}
}