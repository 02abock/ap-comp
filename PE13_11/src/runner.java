public class runner{
	public static void main(String[] args) {
	permutationIterartor iter =new permutationIterartor("eat");
	while(iter.hasMorePermutations())
		System.out.println(iter.nextPermutation());
	}
}