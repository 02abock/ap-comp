public class Executive extends Manager{

	public Executive(String GivenName, int givenSalery, String givenDepartment) {
		super(GivenName, givenSalery, givenDepartment);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return"Name:" +super.getName()+" Salery"+super.getSalery()+" department"+department;  
	}
	
}