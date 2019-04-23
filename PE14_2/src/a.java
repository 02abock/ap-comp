public class a {
  public static void main(String[] args) {

	  coin[] myArray=new  coin[4];
		 coin Q=new coin( .25, "quarter");
		 coin D=new coin( .10, "dime");						 
		 coin N=new coin( .05, "nickle");
		 coin P=new coin( .01, "penny");
myArray[0]=Q;
myArray[1]=N;
myArray[2]=D;
myArray[3]=P;

SelectionSorter temp =  new SelectionSorter(myArray);

temp.sort();

temp.print();
  }
}