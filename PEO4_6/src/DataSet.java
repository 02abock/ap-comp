import java.lang.Math;
public class DataSet
{
	private int max;
	private int min;
	public DataSet()
	{
		max=Integer.MAX_VALUE;
		min=Integer.MIN_VALUE;
	}
	public void addValue(int x)
	{
		max=Math.max(max, x);
		min=Math.min(min, x);		
	}
	public int
}
