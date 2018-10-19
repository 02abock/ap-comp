
public class RoachSimulator {
  public static void main(String arg[]){
  
	  RoachPopulation test= new RoachPopulation (10);
	 test.breed();
	 test.spary();
	  System.out.println(test.getRoaches());
	  test.breed();
		 test.spary();
		  System.out.println(test.getRoaches());
		  test.breed();
			 test.spary();
			  System.out.println(test.getRoaches());

  }
  }