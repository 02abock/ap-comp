
import java.util.Arrays;
import java.util.Scanner;

public class addtionSubtractionArray {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter length of list");
int listLenght=sc.nextInt();
int[] numbers =new int [(listLenght)];
for(int i=0;i<listLenght; i++){
	System.out.println("enter a number to put in list");
	numbers[i]=sc.nextInt();
}
int answer=0;
for(int i=0;i<listLenght; i++){
if(i%2==0){
	answer+=numbers[i];
}
else{
	answer-=numbers[i];
}
}
System.out.println(Arrays.toString(numbers));
System.out.println(answer);
  }
}