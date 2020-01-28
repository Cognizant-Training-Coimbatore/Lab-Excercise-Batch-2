
public class program_validate 
{
	static void validate(int age)throws  program_exceptionsub_class
	{
		if(age<18)
			throw new  program_exceptionsub_class("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args)
	{
		try
		{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured"+m);
		}
		
		

	}

}
