public class product {
	
	public product ( String Name, double Price)
	{
		productName=Name;
		productPrice=Price;
	}
	
	public String getName()
	{
		return productName;
	}
	public double getPrice()
	{
		return productPrice;
	}
	public void reducePrice(double Discount )
	{
		productPrice-=Discount;
	}
	
	private String productName;
	private double productPrice;
	}
	