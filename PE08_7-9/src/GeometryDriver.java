import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
public class GeometryDriver{
	public static void main(String []args){
		Ellipse2D.Double e =new Ellipse2D.Double(0.0,0.0,5.0,10.0);
		Point2D.Double p =new Point2D.Double(0.0,0.0);
				Point2D.Double q =new Point2D.Double(1.0,2.0);

		System.out.println(Geometry.perimeter(e));
		System.out.println(Geometry.area(e));
		System.out.println(Geometry.angle(p,q));
		System.out.println(Geometry.slope(p,q));
		System.out.println(Geometry.isInside(p,e));


	}

}
