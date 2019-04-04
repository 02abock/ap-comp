import java.util.Arrays;

public class DataSet{
	public DataSet(int[] values, int first, int last) {
		myValues=values;
	}
	public int getSum() {
		if (myValues.length==1) {
		return myValues[0];
		}
		DataSet tempSet=new DataSet(Arrays.copyOfRange(myValues,1,myValues.length),0,0);
		return myValues[0]+tempSet.getSum();
	}
	int[] myValues;
}