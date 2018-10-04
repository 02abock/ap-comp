import java.awt.Rectangle;
public class IntersectionPrinter{
  public static void main(String arg[]){
	  Rectangle box1 = new Rectangle(0,0,10,10);
	  Rectangle box2 = new Rectangle(5,5,10,10);
	  Rectangle box3 = box1.intersection(box2);
	  System.out.println("box1"+box1);
	  System.out.println("box2"+box2);
	  System.out.println("box3"+box3);
	  box2.translate(105, 105);
	  box3 = box1.intersection(box2);
	  System.out.println("after translation");
	  System.out.println("box1"+box1);
	  System.out.println("box2"+box2);
	  System.out.println("box3"+box3);


  }
}