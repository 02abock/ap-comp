import java.util.ArrayList;
import java.util.Collections;
public class Purse{
	ArrayList<String> myPurse= new ArrayList<>();
	public Purse() {
		}
	public void addCoin(String coinName) {
		myPurse.add(coinName.toUpperCase());
	}
	public void reverse() {
		Collections.reverse(myPurse);
	}
	public void transfer(purse tran)
}