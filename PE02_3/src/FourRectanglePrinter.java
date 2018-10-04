import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JApplet;


public class FourRectanglePrinter extends JApplet {
  public static void main(String arg[]){
	  Rectangle box = new Rectangle(0,0,10,10);
	  System.out.println(box);
	  box.translate(10,0);
	  System.out.println(box);
	  box.translate(0,10);
	  System.out.println(box);
	  box.translate(-10,0);
	  System.out.println(box);


  }
  public void paint(Graphics g){
	  Graphics2D g2 =(Graphics2D) g;
	
	  Rectangle box = new Rectangle(0,0,10,10);
	  System.out.println(box);
	  g2.draw(box);
	  box.translate(10,0);
	  System.out.println(box);
	  g2.draw(box);
	  box.translate(0,10);
	  System.out.println(box);
	  g2.draw(box);
	  box.translate(-10,0);
	  System.out.println(box);
	  g2.draw(box);
  }
}