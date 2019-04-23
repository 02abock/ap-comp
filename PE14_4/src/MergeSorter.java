public class MergeSorter{
	public MergeSorter(String[] anArray)
	{
		a=anArray;
	}
	public void sort() {
		 if(a.length<=1) return;
		 String[] first=new String[a.length/2];
		 String[] second=new String[a.length-first.length];
		 System.arraycopy(a,0,first,0,first.length);
		 System.arraycopy(a,first.length,second,0,second.length);
		 MergeSorter firstSorter=new MergeSorter(first);
		 MergeSorter secondSorter=new MergeSorter(second);
		 firstSorter.sort();
		 secondSorter.sort();
		 merge(first,second);
	}
	private void merge(String[] first, String[] second)
	{
		int iFirst=0;
		int iSecond=0;
		int j=0;
		while (iFirst< first.length&& iSecond< second.length) {
			if (first[iFirst].compareTo(second[iSecond])<0) {
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
	private String[] a;
	
}