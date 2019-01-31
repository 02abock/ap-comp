
public class DieSimulation
{
   public static void main(String[] args)
   {
      final int TRIES = 10;
      DataSet ds = new DataSet();
      
      for (int i = 1; i <= TRIES; i++)
      {  
         Die d = new Die(6);
         Measurable x = (Measurable) d;
         int n = d.cast();
         ds.add(x);
         System.out.print(n + " ");
      }

      System.out.println();
      System.out.println("Average: " + ds.getAverage());      
   }
}
