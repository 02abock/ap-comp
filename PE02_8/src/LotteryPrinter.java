import java.util.Random;
public class LotteryPrinter{
	public static void main(String arg[]){
		Random rand = new Random(); 
		int a=rand.nextInt(49)+1;
		int b=rand.nextInt(49)+1;
		int c=rand.nextInt(49)+1;
		int d=rand.nextInt(49)+1;
		int e=rand.nextInt(49)+1;
		int f=rand.nextInt(49)+1;
		System.out.println("play this combonation "+a+" "+b+" "+c+" "+d+" "+e+" "+f);
	

}
}