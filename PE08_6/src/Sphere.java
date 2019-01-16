import java.lang.Math;
public class Sphere{
	
	public Sphere() {
		
	}
	
	public  double sphereVolume(double r)
	{
		return 4.0/3.0*Math.PI*r*r*r;	
	}
	public  double sphereSurface(double r) {
		return 4*Math.PI*r*r;
	}
}