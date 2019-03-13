public class Manager extends Employee{

	public Manager(String GivenName, int givenSalery,String givenDepartment ) {
		super(GivenName, givenSalery);
		department=givenDepartment;
	}

String department="";	
public String toString() {
	return"Name:" +super.getName()+" Salery"+super.getSalery()+" department"+department;
}

}