import java.lang.Math;
public class Triangle {
	
	private double aX;
	private	double aY;
	private	double bX;
	private	double bY;
	private	double cX;
	private	double cY;
	private	double lengthC;
	private	double lengthB;
	private	double lengthA;
	
	public Triangle(double xPointA, double yPointA, double xPointB, double yPointB,
			double xPointC, double yPointC) {
		aX = xPointA;
		aY = yPointA;
		bX = xPointB;
		bY = yPointA;
		cX = xPointC;
		cY = yPointA;
		lengthC = Math.sqrt((aX-bX) * (aX-bX) + (aY-bY) * (aY - bY));
		lengthB = Math.sqrt((aX-cX) * (aX-cX) + (aY-cY) * (aY - cY));
		lengthA = Math.sqrt((bX-cX) * (bX-cX) + (cY-bY) * (cY - bY));
	}
	
	
	
	public double getLengthC() {
		return lengthC;
	}
	
	public double getLengthA() {
		return lengthA;
	}

	public double getLengthB() {
		return lengthB;
	}
	
	public double getPerimeter() {
		return lengthA + lengthB + lengthC;
	}
	
	public double getAngleA() {
		return Math.acos((-1*(lengthA * lengthA) + (lengthB * lengthB) + (lengthC * lengthC)) / ( 2* lengthB * lengthC)) ;
	}
	
	public double getAngleB() {
		return Math.acos(((lengthA * lengthA) - lengthB * lengthB + lengthC * lengthC) / ( 2* lengthA * lengthC)) ;
	}
	
	public double getAngleC() {
		return Math.acos((lengthA * lengthA + lengthB * lengthB - lengthC * lengthC)  / (2 * lengthB * lengthA));
	}
	
	
}
