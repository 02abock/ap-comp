
public class PersonTester
{
   public static void main(String[] args)
   {
      class personMeasurer implements Measurer{

		
		public double measure(Object anObject) {
			Person personA=(Person)anObject;
			return personA.getHeight();
		}
    	  
      }

      DataSet data= new DataSet(personMeasurer);

      data.add(new Person("Joe", 183));
      data.add(new Person("Chrissy", 158));
      data.add(new Person("Bobby", 175));

      double avg = . . .
      Person max = . . .

      System.out.println("Average height: " + avg);
      System.out.println("Expected: 172");
      System.out.println("Name of tallest person: " + max.getName());
      System.out.println("Expected: Joe");
   }
}