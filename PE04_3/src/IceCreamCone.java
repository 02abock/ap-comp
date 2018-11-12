import java.lang.Math;
public class IceCreamCone
{


   private double height;
   private double Radius;
   private double totalSurfaceArea;
   private double circleArea;

   /**
      Constructs a cash register with no money in it.
   */
   public IceCreamCone(double coneHieght,double coneRadius)
   {
	   height = coneHieght;
	   Radius = coneRadius;
   }
   public double getSurfaceArea()
   {
	   totalSurfaceArea=Math.PI*Radius*(Radius+Math.sqrt((height*height)+(Radius*Radius)));
	   circleArea=Math.PI*(Radius*Radius);
			   
	   return totalSurfaceArea-circleArea;
   }
   public double getVolume()
   {
	   
	   return Math.PI*(Radius*Radius)*(height/3);
   }
}
