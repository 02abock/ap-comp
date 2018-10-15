public class letter {
	
	public letter ( String initialmessage)
	{
		message=initialmessage;
	}public  letter ()
	{
		message="";
	}
	
	public void addLine(String line)
	{
		message.concat("\n").concat(line);
	}public String getText()
	{
		return message;
	}
	
	private String message ;
	}
	