public class CoverterTester {
	public static void main(String []args) {
		
		final double MILE_TO_KM = 1.609;
		
		Converter milesToMeters = new Converter(1000 * MILE_TO_KM);
		
		System.out.print("5 Miles Is... Expected: 8045 m Console: ");
		System.out.println(milesToMeters.convertTo(5));
		
	}
}