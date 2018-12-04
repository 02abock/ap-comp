import java.util.Scanner;
public class ProjectileFlight{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Double velocity=sc.nextDouble();
		
		Double deltaT=0.01; 
		Double distance=0.0;
		Double gravity=9.81;
		int counter=0;

		while(velocity>0) {
			
			distance=distance+(velocity*deltaT);
			velocity=velocity-(gravity*deltaT);
	
			counter+=1;
		
			if(counter==100) {
				System.out.println(distance);
				counter=0;
			}
		}
	
	}
}	