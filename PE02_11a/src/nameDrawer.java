import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;
public class nameDrawer extends JApplet
{
	public void paint(Graphics g){
	Graphics2D g2 =(Graphics2D) g;
	Rectangle box= new Rectangle(10,10,500,600 );
	g2.setColor(Color.BLUE);
	g2.draw(box);
	g2.setColor(Color.RED);
	g2.drawString("Adam Bock is meager compared to tomas", 300, 300);
	}
	
}
