//Adam Bock 
import java.util.Random;
public class PermutationGenerator{
private int[] numbers= {1,2,3,4,5,6,7,8,9,10};
Random r = new Random();
public PermutationGenerator (){
}
public int[] nextPermutation() {
	boolean isInList;
	isInList=false;
	int[] Permutation=new int[10];
	int possibleValue;
	int i=0;
	while (i<10 ) {
		possibleValue=numbers[r.nextInt(10)];
		isInList=false;
		for(int j=0;j<10;j++) {
			if(Permutation[j]==possibleValue) {
				isInList = true; 				
}
}
if(!isInList){
	Permutation[i]=possibleValue;
	i++;
}
}
return Permutation;
}
}