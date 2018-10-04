import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
public class Eclipse extends JComponent
{
	public void paint(Graphics g){
		Graphics2D a = (Graphics2D) g;
		Ellipse2D redEllipse= new Ellipse2D.Double(0,0,getWidth(),getHeight());

		a.draw(redEllipse);
		a.setColor(Color.BLUE);
		a.fill(redEllipse);
		
		
		
	}
}