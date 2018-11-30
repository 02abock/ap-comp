public class grade{
	

	public grade() {
	}
	public double getNumericGrade(String letterGrade) {
		
		String givenValue=letterGrade.substring(0, 1);
		String givenmoddifeyer=letterGrade.substring(1,2);
		double grade;

	 
		if(givenValue.equals("A")) grade=4;
		else if(givenValue.equals("B")) grade=3;
		else if(givenValue.equals("C")) grade=2;
		else if(givenValue.equals("D")) grade=1;
		else if(givenValue.equals("F")) grade=0;
		
		
		if(givenmoddifeyer.equals("A")) grade=4;
		else if(givenmoddifeyer.equals("B")) grade=3;
		else if(givenmoddifeyer.equals("C")) grade=2;
		else if(givenmoddifeyer.equals("D")) grade=1;
		else if(givenmoddifeyer.equals("F")) grade=0;


		
		
	

}
	}