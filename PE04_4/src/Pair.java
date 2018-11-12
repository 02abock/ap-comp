import java.lang.Math;
public class Pair 
{
	private double firstNumber;
	private double secondNumber;

public Pair(double aFirst, double aSecond)
{
	firstNumber=aFirst;
	secondNumber=aSecond;
}
public double getSum()
{
	return (firstNumber+ secondNumber);
}
public double getdifference()
{
	return (firstNumber- secondNumber);
}
public double getProduct()
{
	return (firstNumber* secondNumber);
}
public double getAverage()
{
	return ((firstNumber+ secondNumber)/2);
}
public double getDistance()
{
	return (Math.abs(firstNumber - secondNumber));
}
public double getMaximum()
{
	return Math.max(firstNumber, secondNumber);
}
public double getMiniumum()
{
	return Math.min(firstNumber, secondNumber);
}
}