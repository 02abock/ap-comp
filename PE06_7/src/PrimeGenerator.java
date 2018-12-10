public class PrimeGenerator {
	
	int num;
	int current = 2;
	
	PrimeGenerator(int Number) {
		num = Number;
	}
	
	public int nextPrime() {
		for (int i = current; i < num; i++) {
			if (isPrime(i)) {
				current = i + 1;
				return i;
			}
		}
		return 0;
	}
	
	
	private boolean isPrime(int primeCheck) {
		for (int i = 2; i < primeCheck; i++) {
			if (primeCheck%i == 0)
				return false;
		}
		return true;
	}
	

}