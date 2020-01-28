
public class program38_exception
{
	static void validate(int age)throws program37_my_exception
	{
		if(age<18)
			throw new program37_my_exception("not valid");
		else
			System.out.println("Welcome to vote");
	}

	public static void main(String[] args)
	{
		try
		{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured :"+m);
		}
	}

}
