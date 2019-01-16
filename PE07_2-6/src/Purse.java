import java.util.ArrayList;
import java.util.Collections;

public class Purse {	
ArrayList<String> acount = new ArrayList<>();
	public Purse() {
	}
	public void addCoin(String coinName) {
		acount.add(coinName.toUpperCase());
	}
	public void reverse() {
		Collections.reverse(acount);	}
	public void transfer(Purse tran) {
		for (int i = 1; i <= acount.size() ; i++)
			tran.addCoin(acount.get(i-1));
		acount.clear();
	}
	public boolean sameContents(Purse secondPurse) {
		if (!(acount.size() == secondPurse.acount.size()))
				return false;
		for (int i = 1; i <= acount.size() ; i++)
			if (!(secondPurse.acount.get(i) == acount.get(i))) return false;
		return true;
	}
	public boolean sameCoins(Purse secondPurse) {
		if (secondPurse.acount.size() != acount.size())
			return false;
		ArrayList<String> temp = (ArrayList) secondPurse.acount.clone();
		for (int i = 1; i <= acount.size(); i++) {
			boolean neverTrue = true;
			for (int q = 1; q <= acount.size(); q++) {
				if (acount.get(i-1) == secondPurse.acount.get(q-1))
					neverTrue = false;
			}
			if (neverTrue == true)
				return false;
		}
		return true;
	}
	public ArrayList getArray() {
		return acount;
	}
}