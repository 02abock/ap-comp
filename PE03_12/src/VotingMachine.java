import java.time.*;
import static java.time.temporal.TemporalAdjusters.firstInMonth;
import java.time.format.DateTimeFormatter;

public class VotingMachine {
	
	public VotingMachine ()
	{
	
	}
	
	public void VoteDemocratic()
	{
		 democraticCount+=1;
		
	}public void VoteRepublican()
	{
		republicanCount+=1;
	}
	public void ClearVote()
	{
		democraticCount=0;
		republicanCount=0;
	}
	public String getvoteCount()
	{
		LocalDate localDate= LocalDate.now();
		LocalDate firstTeusday= localDate.with(firstInMonth(DayOfWeek.TUESDAY));
		DateTimeFormatter formats=DateTimeFormatter.ofPattern("mm");
		
		if(localDate==firstTeusday && localDate.format(formats)=="11") {
			if(democraticCount>republicanCount) {
				return "Democratis won the race";
			}
			else if(democraticCount<republicanCount) {
				return "Republicans won the race";
			}
			else {
				return"the vote is tied";
			}
		}
		else {
						
		return "Democratic Vote "+ democraticCount +"	Republican Vote"+ republicanCount;
	}
	}
	private int democraticCount=0;
	private int republicanCount=0;
	}
	