public class FactorGenerator {
	
	int num;
	
	FactorGenerator(int Number) {
		num = Number;
	}
	
	public int nextFactor() {
		int x = 2;
		boolean found = true;
		if (num>2) {
			while (found) {
				if (num%x == 0) {
					num /= x;
					return x;
				}
				x++;
			}
		}	
		return 1;
	}
	public boolean hasMoreFactors() {
		return (num > 2);
	}
}