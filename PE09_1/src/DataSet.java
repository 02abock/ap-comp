public class DataSet 
{ 
	public DataSet() {
		
	}
   public void add(Measurable x) 
   { 
      sum = sum + x.getMeasure(); 
      if (count == 0 || maximum.getMeasure() < x.getMeasure()) 
         maximum = x; 
      if (count == 0 || minamum.getMeasure() > x.getMeasure()) 
          maximum = x;
      count++; 
   } 
   public double getAverage() {
	   return sum *1.0/count;
   }

   public Measurable getMaximum() 
   { 
      return maximum; 
   } 
   public Measurable getMinamum()
   {
	   return minamum;
   }
   private double sum; 
   private Measurable maximum; 
   private int count; 
   private Measurable minamum;
}