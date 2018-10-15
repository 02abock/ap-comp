public class RoachPopulation {
	
	public RoachPopulation ( int initialpopulation)
	{
		RoachPopulation=initialpopulation;
	}
	
	public void breed()
	{
		RoachPopulation*=2;
	}public void spary()
	{
		RoachPopulation*=.90;
	}
	public int getRoaches()
	{
		return RoachPopulation;
	}
	private int RoachPopulation;
	}
	