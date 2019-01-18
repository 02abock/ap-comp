import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
public class Geometry {
	public static double perimeter(Ellipse2D.Double e) {
		double b=e.getHeight();
		double a=e.getWidth();
		return Math.PI*2*Math.sqrt((a*a)+(b*b)/2); 
		
	}
	public static double area(Ellipse2D.Double e) {
		return Math.PI*e.getHeight()*e.getWidth();
	}
	public static double angle(Point2D.Double p, Point2D.Double q) {
		return 1.0;
	}
}