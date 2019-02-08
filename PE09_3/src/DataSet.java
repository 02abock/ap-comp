
public class DataSet
{

   public DataSet(Measurer aMeasurer)
   {
      sum = 0;
      count = 0;
      maximum = null;
      measurer = aMeasurer;
   }

   public void add(Object x)
   {
      sum = sum + measurer.measure(x);
      if (count == 0 
            || measurer.measure(maximum) < measurer.measure(x))
         maximum = x;
      if (count == 0 
              || measurer.measure(minamum) > measurer.measure(x))
           maximum = x;
      count++;
   }


   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }


   public Object getMaximum()
   {
      return maximum;
   }
   
   public Object getMinamum()
   {
	   return minamum;
   }

   private double sum;
   private Object maximum;
   private Object minamum;
   private int count;
   private Measurer measurer;
}