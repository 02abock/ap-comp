public class ExpApproximator {
  
  public double a;
  public double counter = 1.0;
  public double guess;
  public  double Epsilon;
  public ExpApproximator(double num,Double EPSILON)
  {
    a = num;
    Epsilon=EPSILON;
  }
  public double nextGuess()
  {
    guess = (counter + (a/counter))/2;
    counter =guess; 
    return guess;
  }
  public boolean hasMoreGuesses()
  {
    if (Math.abbguess - ((counter + 1) + (a/(counter + 1)))/2 <= Epsilon)
    {
      return false;
    }
    else
    {
    	return  true;
    }
  }
}