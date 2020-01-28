
public class program51_myException_2 
{
	static void validate(int age)throws program51_my_exception
	{
		if(age<18)
			throw new program51_my_exception("not vallid");
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
			System.out.println("Exception occured :"+m);
		}
	}

}
