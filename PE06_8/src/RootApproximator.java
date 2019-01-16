public class RootApproximator {
	private double previous;
	private static double a;
	private static double dif;
	private boolean simmillarGuess = false;
	
	public RootApproximator(double A, double EPSILON) {
		a = A;
	    previous = (a + 1)/2.0;
	    dif = EPSILON;
	}
	
	public double nextGuess() {
		double guess = ((a/previous)+previous)/2;
		if (Math.abs(guess-previous) <= dif)
			simmillarGuess = true; 
		previous = guess;
		return guess;
	}
	
	public boolean hasMoreGuesses() {
		if (simmillarGuess)
			return false;
		return true;
	}
}