public class Cone{

public Cone() {
		
	}
	public static double coneVolume(double r, double h) {
		return Math.PI*r*r*h/3;
	}
	public static double coneSurface(double r, double h) {
		return Math.PI*r*(r+Math.sqrt(h*h+r*r));
	}
	
}