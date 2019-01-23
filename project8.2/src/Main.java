import java.util.Scanner;
public class Main{
	public static void main(String []args){
Scanner sc = new Scanner(System. in);
System.out.println("enter a zip code: alterntivly enter a 1 to enter a barcode");
int inputInt=sc.nextInt();
String input= String.valueOf(inputInt);

if(inputInt==1){
System.out.println("enter a barcode code:");
 input=sc.next();
 input+="a";
System.out.println("the zip code is");
for( int i=0;i<29;i+=5){
	String temp=input.substring(i,i+5);
int fac7=0;
if(temp.substring(0,1).equals("|"))
	fac7=1;
int fac4=0;
if(temp.substring(1,2).equals("|"))
	fac4=1;
int fac2=0;if(temp.substring(2,3).equals("|"))
	fac2=1;
int fac1=0;
if(temp.substring(3,4).equals("|"))
	fac1=1;
	int num =(7*fac7)+(4*fac4)+(2*fac2)+fac1;
	if(num==11){
	System.out.print(0);	
	}
	else{

	
	System.out.print(num);	
	}
}

}
else{
	System.out.println("");
	input+="a";
for(int i=1;i<6;i++){
	String output ="";
	int temp=Integer.parseInt(input.substring(i,i++));
	if(temp==0) {
		output="||:::";
	}
	else {
		boolean flag=false;
		if(temp==7||temp==4||temp==2||temp==1) {
			 flag=true;
		}
		if(temp>=7) {
			output+="|";
			temp-=7;
			System.out.print(output);

		}
		if(temp>=4) {
			output+="|";
			temp-=4;
			System.out.print(output);

		}
		if(temp>=2) {
			output+="|";
			temp-=2;
			System.out.print(output);

		}
		if(temp>=1) {
			output+="|";
			temp-=1;
			System.out.print(output);

		}
		if(flag) {
			output+="|";
		}
		else {
			output+=":";
		}
	}
	System.out.print(output);
}

}	
}

}
