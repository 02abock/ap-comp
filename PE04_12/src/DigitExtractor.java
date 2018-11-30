public class DigitExtractor {
	private int count;
	private String ext;
	
	public DigitExtractor(int anInteger) {
		ext = Integer.toString(anInteger);
		count = ext.length();
	}
	
	public int nextDigit() {
		count--;
		return Integer.parseInt(ext.substring(count, count+1));
	}
}