
public class ProductPrinter {
  public static void main(String arg[]){
  
	  product oven= new product ("GEoven",150.00);
	  product sandwich= new product("PB&J",10);
	  System.out.println(oven.getName()+oven.getPrice());
	
	  System.out.println(sandwich.getName()+sandwich.getPrice());
oven.reducePrice(5);
sandwich.reducePrice(5);
System.out.println(oven.getName()+oven.getPrice());

System.out.println(sandwich.getName()+sandwich.getPrice());
  }
  }