import java.util.ArrayList;

public class permutationIterartor{
	public permutationIterartor(String s){
		death=getPermutations();
	}
	public ArrayList<String> getPermutations(){
		ArrayList<String> results =new ArrayList<String>();
		if(word.length()==0)
		{
			results.add(word);
			return results;
		}
		for(int i=0; i< word.length(); i++){
			String shorterWord=word.substring(0,i)+word.substring(i+1);
			permutationIterartor temp=new permutationIterartor(shorterWord);
				ArrayList<String> tempArray =temp.getPermutations();
				for (String s: tempArray){
					results.add(word.charAt(i)+s);
				}
					}
		return results;
	}
	public String nextPermutation(){
		String temp=death.get(0);
		death.remove(0);
		return temp;
	}
	public boolean hasMorePermutations(){
		if(death.size()>0){
			return true;
		}
		return false;
	}
	String word;
	ArrayList<String> death =new ArrayList<String>();
}