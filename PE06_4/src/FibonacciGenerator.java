public class FibonacciGenerator{
	int f1=1;
	int f2=1;
	int f3;
	public FibonacciGenerator() {	
	}
	public int nextNumbe() {
		f3=f1+f2;
		f1=f2;
		f2=f3;
		return f3;
	}
}