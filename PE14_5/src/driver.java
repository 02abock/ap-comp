public class driver{
	  public static void main(String[] args) {
		 phoneNumber donn=new phoneNumber("donn",2);
		 phoneNumber adam=new phoneNumber("donn",1);
		 phoneNumber tomas=new phoneNumber("donn",5);
		 phoneNumber taylor=new phoneNumber("donn",4);
		 phoneNumber zach=new phoneNumber("donn",3);
		 phoneNumber[] unSorted={donn,adam,tomas,taylor,zach};
		 mergeSorterStr StrSort=new mergeSorterStr(unSorted);		
		 mergeSorterInt IntSort=new mergeSorterInt(unSorted);
		 StrSort.sort();
		 IntSort.sort();
		 phoneNumber[] IntSorted=IntSort.getArray();
		 phoneNumber[] StrSorted=StrSort.getArray();
		 


		 
	  
	  }
}