
public class program38_validate 
{
	static void validate(int age)throws programm37_create_exception 
	{
		if (age<18)
		{
		throw new programm37_create_exception("not valid");
		}
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) 
	{
		try
		{
			validate(13);
			
		}
		catch (Exception m)
		{
			System.out.println("Exception occured: "+m);
		}

	}

}
