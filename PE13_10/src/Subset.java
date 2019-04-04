public class Subset{
	public Subset(){
		
	}
	public void genorate(String subset, String word){
		if (word.length()==0){
			return;
		}
		genorate(subset+ word.substring(0,1), word.substring(1,word.length()));
		System.out.println(subset);
		genorate(subset, word.substring(1,word.length()));
		System.out.println(subset);

	}
	
}