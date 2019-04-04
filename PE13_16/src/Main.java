import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
				long []found = new long[n]; 
				for (int i=0; i<n;i++){
					found[i]=(long)0;
				}
				found[0]=(long)1;
				found[1]=(long)1;

		for(int i=1; i<=n; i++){
			long fi =fib(i,found);
				System.out.println("fib("+i+") = "+fi);
			}
	}
	public static long fib(int n, long[] a){
		if(n<=2) return 1;
		if(!( a[n-1]==0)){
			System.out.println("used");
			return a[n-1];
			
		}
		else{ 
			long temp= fib(n-1,a) + fib(n-2,a);
			a[n-1]=temp;
			return temp;
	}
	}
}