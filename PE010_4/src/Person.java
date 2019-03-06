import java.util.Date;

public class Person{
	public Person(String givenName,Date givenDate){
		name=givenName;
		date= givenDate;
	}
public String getName(){
	return name;
}
public Date getDate(){
	return date;
}
public void setName(String givenName) {
name=givenName;	
}
public void setDate(Date givenDate) {
date=givenDate;	
}
String name="";
Date date;
}