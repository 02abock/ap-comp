/**
   Computes the minimum and maximum of a set of Comparable values.
*/
public class DataSet
{
   /**
      Constructs an empty data set.
   */
   public DataSet()
   {
	     Maximum=null;
	     Minamum=null;
	     count=0;
	   
   }

   /**
      Adds a data value to the data set.
      @param x a data value
   */      
   public void add(Comparable x) 
   { 
	   if(count==0|| Maximum.compareTo(x)<0) {
		   Maximum=x;
	   }
	   if(count==0|| Minamum.compareTo(x)>0) {
		   Minamum=x;}
	   count++;
   }     

   /**
      Gets the largest of the added data.
      @return the maximum or null if no data has been added
   */
   public Comparable getMaximum()
   {
return Maximum;   }
   
   /**
      Gets the largest of the added data.
      @return the maximum or null if no data has been added
   */
   public Comparable getMinimum()
   {
return Minamum;   }   

   private Comparable Maximum=0;
   private Comparable Minamum=0;
   private int count=0;}