public class Quiz implements Measurable{

	private String letterGrade="";
	private int grade=0;
	public Quiz(int xGrade,String letGrade) {
		letterGrade=letGrade;
		grade=xGrade;
	}
	public double getMeasure() {
		return grade;
	}
	public String getScore() {
		return letterGrade;
	}
	public int getGrade() {
		return grade;
	}

}