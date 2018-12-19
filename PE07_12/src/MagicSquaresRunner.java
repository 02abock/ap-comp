import java.util.Scanner;
public class MagicSquaresRunner{
	public static void main(String []args) {
		MagicSquares tester = new MagicSquares(3);
		Scanner sc=new Scanner(System.in);
		for(int i =0;i<9;i++) {
			System.out.println("input value");
			tester.addValue(sc.nextInt());
		}
		System.out.println(tester.isMagic());
	}
}