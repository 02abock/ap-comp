import java.util.Date;

public class Student extends Person{

	public Student(String givenName, Date givenDate,String givenMajor) {
		super(givenName, givenDate);
		major=givenMajor;
		
	}
	public void setMajor(String givenMajor) {
		major=givenMajor;
	}
	public String getMajor() {
		return major;
	}
String major="";	
}