public class worker{
	public worker(String GivenName, Double givenSalery) {
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
	public void setSalery(Double givenSalery) {
		salery= givenSalery;
	}
	
	String name="";
	Double salery;
}