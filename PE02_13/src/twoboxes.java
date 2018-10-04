import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;
public class twoboxes extends JApplet
{
	public void paint(Graphics g){
	Graphics2D g2 =(Graphics2D) g;
	Rectangle box= new Rectangle(10,10,10,10 );
	Rectangle box2= new Rectangle(30,30,10,10 );
	Color a = new Color(148,0,211);
	g2.setColor(Color.PINK);
	
	g2.draw(box);
	g2.fill(box);
	g2.setColor(a);
	g2.draw(box2);
	g2.fill(box2);
	}
	
}