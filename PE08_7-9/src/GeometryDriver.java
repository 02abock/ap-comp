import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
public class GeometryDriver{
	public static void main(String []args){
		Ellipse2D.Double e =new Ellipse2D.Double(0.0,0.0,5.0,10.0);
		System.out.println(e.getHeight());
		System.out.println(Geometry.perimeter(e));
	}

}