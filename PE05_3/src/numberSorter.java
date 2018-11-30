import java.util.Scanner;
public class numberSorter{
	public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double givenFirstNum =sc.nextDouble();
		 double givenSecondNum =sc.nextDouble();
		 double givenThirdNum =sc.nextDouble();
		 double first;
		 double second;
		 double third;
		 if(givenFirstNum>givenSecondNum) {
			 if(givenFirstNum>givenThirdNum) {
				first=givenFirstNum;
				 if(givenSecondNum>givenThirdNum) {
					 second=givenSecondNum;
					 third=givenThirdNum;
				 }
				 else {
					 second=givenThirdNum;
					 third=givenSecondNum;
				 }
			 }
			 else {
				 first=givenThirdNum;
				 second=givenFirstNum;
				 third=givenSecondNum;
			 }
		 }
		 else if(givenSecondNum>givenThirdNum) {
			 first=givenSecondNum;
			 if(givenFirstNum>givenThirdNum) {
				 second=givenFirstNum;
				 third=givenThirdNum;
			 }
			 else {
				 second=givenThirdNum;
				 third=givenFirstNum;
			 }
		 }
		 else {
			 first=givenThirdNum;
			 if(givenFirstNum>givenSecondNum) {
				 second=givenFirstNum;
				 third=givenSecondNum;
			 }
			 else {
				 second=givenSecondNum;
				 third=givenFirstNum;
			 }
		 }
		 System.out.println(first);
		 System.out.println(second);
		 System.out.println(third);

		 }
	}

