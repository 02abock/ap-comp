
public class votingTest {
  public static void main(String arg[]){
  
	  VotingMachine test= new VotingMachine ();
test.VoteDemocratic();
test.VoteDemocratic();
System.out.println(test.getvoteCount());
test.ClearVote();
System.out.println(test.getvoteCount());

  }
  }