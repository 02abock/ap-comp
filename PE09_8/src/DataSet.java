public class DataSet
{
   /**
      Constructs an empty data set with a given measurer.
      @param aMeasurer the measurer that is used to measure data values
   */
   public DataSet(Measurer aMeasurer, Filter aFilter)
   {
      sum = 0;
      count = 0;
      maximum = null;
      measurer = aMeasurer;
      minamum=null;
      filter = aFilter;
	}

   /**
      Adds a data value to the data set.
      @param x a data value
   */
   public void add(Object x)
   {if(filter.accept(x)) {
	   sum = sum + measurer.measure(x);
	   if (count == 0 
			   || measurer.measure(maximum) < measurer.measure(x))
		   maximum = x;
	   if (count == 0 
			   || measurer.measure(minamum) > measurer.measure(x))
		   minamum = x;  
	   count++;
	   }
   }

   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }

   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
   public Object getMaximum()
   {
      return maximum;
   }

   /**
      Gets the smallest of the added data.
      @return the minimum or 0 if no data has been added
   */
   public Object getMinimum()
   {
	   return minamum;
   }
   private Filter filter;
   private double sum;
   private Object maximum;
   private int count;
   private Measurer measurer;
   private Object minamum;
}