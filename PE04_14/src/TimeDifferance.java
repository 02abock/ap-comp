import java.util.Scanner;
import java.lang.Math;

public class TimeDifferance{
	public static void main(String voids[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("EnterFirstTime: ");
		int firstTime= in.nextInt();
		System.out.print("EnterSecondTime: ");
		int SecondTime= in.nextInt();
		int firsthour=firstTime/100;
		int secondhour=(SecondTime-100)/100;

		int firstminutes=firstTime%100;

		int Secondminutes=SecondTime%100;

		System.out.print(Math.abs(firsthour -secondhour) );
		System.out.print(firstminutes-Secondminutes);


	}
}
