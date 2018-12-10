import java.util.Scanner;

public class MeanStand {
	public static void main(String []args) {
		
		Scanner in = new Scanner(System.in);
		int count = 0;
		boolean running = true;
		Double sum = (double) 0;
		
		while (running) {
			System.out.println("Enter number:");
			sum += in.nextDouble();
			count ++;
			System.out.print("Average: " + sum/count);
			System.out.println(" Standard Deviation: " + Math.sqrt((sum * sum - 1/count * (sum * sum))/(count-1)));
		}
	}
}