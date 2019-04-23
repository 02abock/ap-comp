public class driver{
	public static void main(String[] args) {
	
		String[] myArray =new String[3];
		myArray[0]="tomas";
		myArray[1]="adam";
		myArray[2]="donn";
		MergeSorter tester=new MergeSorter(myArray);
		tester.sort();
		tester.print();
	  }
}