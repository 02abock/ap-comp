import java.util.Arrays;

public class permTester{
	public static void main (String[] args) {
		PermutationGenerator tester= new PermutationGenerator();
		System.out.println(Arrays.toString(tester.nextPermutation()));
	}
}