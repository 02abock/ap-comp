public class Employee{
	public Employee(String GivenName, int givenSalery) {
		name=GivenName;
		salery=givenSalery;
	}
	public String getName() {
		return name;
	}
	public double getSalery() {
		return salery;
	}
	public void setName(String givenName) {
		name=givenName;
	}
	public void setSalery(int givenSalery) {
		salery= givenSalery;
	}
	public  String toString() {
		return"Employee[name="+name+",salary="+String.valueOf(salery)+"]";
	}
	
	String name="";
	int salery;
}