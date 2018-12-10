public class FactorPrinter {
	public static void main(String []args) {
		
		FactorGenerator fg = new FactorGenerator(150);
		
		
		System.out.println("Number to factor: " + fg.num);
		System.out.println("Has more factors: " + fg.hasMoreFactors() + " | Expected: True");
		System.out.println("Factor: " + fg.nextFactor() + " | Expected: 2");
		System.out.println("Has more factors: " + fg.hasMoreFactors() + " | Expected: True");
		System.out.println("Factor: " + fg.nextFactor() + " | Expected: 3");
		System.out.println("Has more factors: " + fg.hasMoreFactors() + " | Expected: True");
		System.out.println("Factor: " + fg.nextFactor() + " | Expected: 5");
		System.out.println("Has more factors: " + fg.hasMoreFactors() + " | Expected: True");
		System.out.println("Factor: " + fg.nextFactor() + " | Expected: 5");
		System.out.println("Has more factors: " + fg.hasMoreFactors() + " | Expected: False");
	}
}