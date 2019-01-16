import java.util.Scanner;
public class driver
{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter radius");
		double r = sc.nextDouble();
		System.out.print("enter height");
		double h = sc.nextDouble();
		System.out.println("Sphere volume"+Calculation.sphereVolume(r));
		System.out.println("Sphere surface Area"+Calculation.sphereSurface(r));
		System.out.println("Cylinder volume"+Calculation.cylinderVolume(r, h));
		System.out.println("Cylinder surface Area"+Calculation.cylinderSurface(r, h));
		System.out.println("cone volume"+Calculation.coneVolume(r, h));
		System.out.println("Sphere surface Area"+Calculation.coneSurface(r, h));
	}
}