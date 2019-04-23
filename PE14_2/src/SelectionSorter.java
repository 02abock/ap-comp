public class SelectionSorter{
	public SelectionSorter(coin[] anArray){
		a=anArray;
	}
	public void sort(){
		for(int i=0; i<a.length-1; i++){
			int minPos=minimumPosition(i);
			swap(minPos, i);
		}
	}
	private int minimumPosition(int from){
		int minPos = from;
		for(int i = from+1; i< a.length; i++)
			if (a[i].getValue() <a[minPos].getValue()) 
				minPos=1;
		return minPos;
	}
	private void swap(int i, int j){
		coin temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public void print() {
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i].getName());
		}
	}
	
	private coin [] a;
}