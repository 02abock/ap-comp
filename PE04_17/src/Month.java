public class Month{
	public Month(){
		MONTH_LIST="          January   February  March     April     May       June      July      August    September October   November  December    ";
	}
	public String getName(int a) {
		return MONTH_LIST.substring(a*10,a*10+9);
	}
	private final String MONTH_LIST; 
}