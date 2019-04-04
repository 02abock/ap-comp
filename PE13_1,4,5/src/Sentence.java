public class Sentence{
	public Sentence(String aWord){
		word=aWord;
		}
	public String getText() {
		return word;
	}
	public void reverse() {
		String tempWord="";
		if (!(word.length()==1)) {
			Sentence tempgreeting=new Sentence(word.substring(1));
			tempgreeting.reverse();
			tempWord+=tempgreeting.getText();
			
		}
		tempWord+=word.substring(0,1);
		word=tempWord;
	}
	public boolean find(String findWord){
		if(word.length()<findWord.length()){
			return false;
		}
		if (word.substring(0,findWord.length()).equals(findWord)){
			return true;
		}
		Sentence tempS=new Sentence(word.substring(1));
		return tempS.find(findWord);
	}
	public int findint(String findWord){
		if(word.length()<findWord.length()){
			return -1;
		}
		if (word.substring(0,findWord.length()).equals(findWord)){
			return 1;
		}
		Sentence tempS=new Sentence(word.substring(1));
		return 1 + tempS.findint(findWord);
	}
	String word="";
}