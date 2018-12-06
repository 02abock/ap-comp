import java.util.Scanner;
public class ProjectileFlight{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Double velocity=sc.nextDouble();
		
		Double deltaT=0.01; 
		Double distance=0.0;
		Double gravity=9.81;
		int counter=0;
		ProjectileEquationClass tester= new ProjectileEquationClass(velocity);

		do {
			
			distance=distance+(velocity*deltaT);
			velocity=velocity-(gravity*deltaT);
			counter++;
				if(counter%100==0) {
				System.out.println(distance);
				System.out.println("exspected"+ tester.claculate(counter));
			} 
		}while(distance>0.0);
		System.out.println(distance);
		System.out.println("exspected"+ tester.claculate(counter));

		
	}
}	