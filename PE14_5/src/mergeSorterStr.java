public class mergeSorterStr{
	public mergeSorterStr(phoneNumber[] anArray)
	{
		a=anArray;
	}
	public void sort() {
		 if(a.length<=1) return;
		 phoneNumber[] first=new phoneNumber[a.length/2];
		 phoneNumber[] second=new phoneNumber[a.length-first.length];
		 System.arraycopy(a,0,first,0,first.length);
		 System.arraycopy(a,first.length,second,0,second.length);
		 mergeSorterStr firstSorter=new mergeSorterStr(first);
		 mergeSorterStr secondSorter=new mergeSorterStr(second);
		 firstSorter.sort();
		 secondSorter.sort();
		 merge(first,second);
	}
	private void merge(phoneNumber[] first, phoneNumber[] second)
	{
		int iFirst=0;
		int iSecond=0;
		int j=0;
		while (iFirst< first.length&& iSecond< second.length) {
			if (first[iFirst].getName().compareTo(second[iSecond].getName())<0) {
				a[j]=first[iFirst];
				iFirst++;
			}
			else {
				a[j]=second[iSecond];
				iSecond++;
			}
			j++;
		}
		System.arraycopy(first, iFirst, a, j, first.length-iFirst);
		System.arraycopy(second, iSecond, a, j, second.length-iSecond);

	}
	public void print() {
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	public phoneNumber[] getArray() {
		return a;
	}
	private phoneNumber[] a;
	
}