public class SubstringGenerator{
	public SubstringGenerator(String aWord) {
		word=aWord;
	}
	public void generate() {
		if(word.length()==1) {
			System.out.println(word);
			return;
		}
		for(int i=1; i<=word.length();i++) {
			System.out.println(word.substring(0, i));
		}
		SubstringGenerator temp=new SubstringGenerator(word.substring(1));
		temp.generate();
	}
	String word="";
}