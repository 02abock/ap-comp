import java.awt.Color;
public class BrighterDemo{
  public static void main(String arg[]){
	  Color Brighter=new Color(50,100,150);
	  Brighter=Brighter.brighter();
	  System.out.println( Brighter.toString());
  
  }
  }