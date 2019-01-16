import java.util.Scanner;
public class driver
{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter radius");
		double r = sc.nextDouble();
		System.out.print("enter height");
		double h = sc.nextDouble();
		Sphere sphereMath=new Sphere();
		Cylinder cylinderMath=new Cylinder();
		Cone coneMath=new Cone();

		System.out.println("Sphere volume"+sphereMath.sphereVolume(r));
		System.out.println("Sphere surface Area"+sphereMath.sphereSurface(r));
		System.out.println("Cylinder volume"+cylinderMath.cylinderVolume(r, h));
		System.out.println("Cylinder surface Area"+cylinderMath.cylinderSurface(r, h));
		System.out.println("cone volume"+coneMath.coneVolume(r, h));
		System.out.println("Sphere surface Area"+coneMath.coneSurface(r, h));
	}
}