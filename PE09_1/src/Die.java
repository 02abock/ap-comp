import java.util.Random;

public class Die implements Measurable
{
   private Random generator;
   private int sides;
   private int castNumber;


   public Die(int s)
   {
      sides = s;
      generator = new Random();
   }

   public int cast()
   {
	   castNumber =1 + generator.nextInt(sides);
      return castNumber;
   }


public double getMeasure() {
	return castNumber;
}
}