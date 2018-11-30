public class Card{
	String givenValue;
	String givenType;
	String value;
	String Type;
	public Card(String card) {
		givenValue=card.substring(0, 1);
		givenType=card.substring(1,2);
	}
	public String getDiscription() {
		if(givenValue.equals("A")) value="Ace";
		else if(givenValue.equals("2"))value="Two";
		else if(givenValue.equals("3"))value="Three";
		else if(givenValue.equals("4"))value="Four";
		else if(givenValue.equals("5"))value="Five";
		else if(givenValue.equals("6"))value="Six";
		else if(givenValue.equals("7"))value="Seven";
		else if(givenValue.equals("8"))value="Eight";
		else if(givenValue.equals("9"))value="Nine";
		else if(givenValue.equals("10"))value="Ten";
		else if(givenValue.equals("J"))value="Jack";
		else if(givenValue.equals("Q"))value="Queen";
		else if(givenValue.equals("K"))value="King";
		else value="Unknown";
		
		if(givenType.equals("D"))Type="Diamond";
		else if(givenType.equals("H"))Type="Hearts";
		else if(givenType.equals("S"))Type="Spades";
		else if(givenType.equals("C"))Type="Clubs";
		else Type="unknow";
		return value + " of " + Type;


	}
}