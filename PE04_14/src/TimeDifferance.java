import java.util.Scanner;
import java.lang.Math;

public class TimeDifferance{
	public static void main(String voids[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("EnterFirstTime: ");
		int firstTime= in.nextInt();
		System.out.print("EnterSecondTime: ");
		int SecondTime= in.nextInt();
		System.out.println(Math.abs(firstTime-SecondTime));
		

	}
}