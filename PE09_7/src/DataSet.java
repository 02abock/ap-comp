import java.awt.Rectangle;

public class DataSet
{

   public DataSet(Measurer aMeasurer)
   {
      sum = 0;
      count = 0;
      maximum = null;
      measurer = aMeasurer;
      minamum=null;
	}

   public DataSet() {
	   class defultMeassurer implements Measurer
	      {
	         public double measure(Object anObject)
	         {
	        	 Measurable temp=(Measurable) anObject;
	           return temp.getMeasure();
	         }
	      }
	   Measurer defMesasurer=new defultMeassurer();
	   sum = 0;
	      count = 0;
	      maximum = null;
	      measurer = defMesasurer;
	      minamum=null;
   }
   public void add(Object x)
   {
      sum = sum + measurer.measure(x);
      if (count == 0 
         || measurer.measure(maximum) < measurer.measure(x))
         maximum = x;  
      if (count == 0 
    	|| measurer.measure(minamum) > measurer.measure(x))
    	minamum = x;  
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

  
   public Object getMinimum()
   {
	   return minamum;
   }

   private double sum;
   private Object maximum;
   private int count;
   private Measurer measurer;
   private Object minamum;
}