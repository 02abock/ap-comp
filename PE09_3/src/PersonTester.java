
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
      personMeasurer Pmesurer = new personMeasurer();
      DataSet data= new DataSet(Pmesurer);

      data.add(new Person("Joe", 183));
      data.add(new Person("Chrissy", 158));
      data.add(new Person("Bobby", 175));

      double avg = data.getAverage();
      Person max =(Person) data.getMaximum();
      Person min=(Person) data.getMinamum();

      System.out.println("Average height: " + avg);
      System.out.println("Expected: 172");
      System.out.println("Name of tallest person: " + max.getName());
      System.out.println("Expected: Joe");
      System.out.println("Name of shortest person: " + min.getName());

   }
}