import java.util.Random;
public class PermutationGenerator{
	private int[] numbers= {1,2,3,4,5,6,7,8,9,10};
	Random r = new Random();
	public PermutationGenerator (){
	}
	public int[] nextPermutation() {
		 int[] Permutation=new int[10];	
		 int possibleValue;
		 for(int i=1; i<=10; i++) {
			 possibleValue=numbers[r.nextInt(10)];
			 int j=0;
			 while(j>10) {
			 if(Permutation[j]!=possibleValue) {
				 Permutation[j]=possibleValue;
				 j++;
			 }
			 
			 }
			 
		 }
			 
		 return Permutation;
	}
	
}