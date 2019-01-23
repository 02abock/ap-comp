import java.awt.geom.Ellipse2D;
import java.lang.Math;
import java.awt.geom.Point2D;
public class Geometry {
	public static double perimeter(Ellipse2D.Double e) {
		double b=e.getHeight();
		double a=e.getWidth();
		double h = Math.pow((a-b), 2) / Math.pow((a+b), 2);

return Math.PI * (a + b) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));		
	}
	public static double area(Ellipse2D.Double e) {
		return Math.PI*e.getHeight()*e.getWidth();
	}
	public static double angle(Point2D.Double p, Point2D.Double q) {
		return Math.atan(slope(p,q));
	} 
	public static double slope(Point2D.Double p,Point2D.Double q) {
		return (p.getY()-q.getY())/(p.getX()-q.getX());
	}
	public static boolean isInside(Point2D.Double p, Ellipse2D.Double e) {
		if (Math.pow((p.getX()-e.getCenterX()), 2) / (Math.pow((e.getWidth() * .5),2)) +
    	(Math.pow((p.getY()-e.getCenterY()), 2) / (Math.pow((e.getHeight() * .5),2)))
    	<= 1){
    		return true;
			}
    	return false;
	}
	 public static boolean isOnboundary(Point2D.Double p, Ellipse2D.Double e) {
    	if (Math.pow((p.getX()-e.getCenterX()), 2) / (Math.pow((e.getWidth() * .5),2)) +
    	(Math.pow((p.getY()-e.getCenterY()), 2) / (Math.pow((e.getHeight() * .5),2)))
    	== 1){
    		return true;
			}
    	return false;
    }
}