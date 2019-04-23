public class BinarySearcherName{
	public BinarySearcherName(phoneNumber[] anArray) {
		a=anArray;
	}
	public int search(int v) { 
		int low=0;
		int high =a.length-1;
		while(low<=high) {
			int mid =(low +high)/2;
			int diff= a[mid].getNum()-v;
			if(diff==0) // a[mid]==v
				return mid;
			else  if(diff<0)//a[mid]<v
				low=mid+1;
			else
				high=mid-1;
			
		}
		return -1;
	}
	private phoneNumber[] a;
}