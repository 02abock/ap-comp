import java.lang.Math; 
public class quadraticEquation{
	private double a;
	private double b;
	private double c;
	public quadraticEquation(double numbera,double numberb,double numberc){
		a=numbera;
		b=numberb;
		c=numberc;
	}
	public boolean hassdiscrimint() {
		if((b*b-4*a*c)>=0) {
		return true;}
		else {
			return false;
		}		
	}
	public double getSolution1() {
		if(hassdiscrimint()) {
		return (-1*b+Math.sqrt(b*b-4*a*c))/2*a;
		}
		else {
			return 0;
		}
	}
	public double getSolution2() {
		if(hassdiscrimint()) {
		return (-1*b-Math.sqrt(b*b-4*a*c))/2*a;
		}
		else {
			return 0;
		}
	}
}