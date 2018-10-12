public class car {
	
	public car ( double initialgasmillage)
	{
		gasMileage=initialgasmillage;
	}public  car ()
	{
		gasMileage=0;
	}
	
	public void addGas(double amount)
	{
		gasLevel+= amount;
	}public void driveCar(double milesDriven)
	{
		gasLevel-=(milesDriven/gasMileage);
	}
	public double getGasInTank()
	{
		return gasLevel;
	}
	
	private double gasLevel;
	private double gasMileage;
	}
	