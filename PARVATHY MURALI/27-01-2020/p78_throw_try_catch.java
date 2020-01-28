
public class p78_throw_try_catch
{
	static void validate(int age) throws p76_useexception
	{
		if(age<18)
		{
			throw new p76_useexception("not valid");
			
		}
		else
		{
			System.out.println("Wecome to vote");
		}
	}
	
	
	public static void main(String[] args) 
	{
	try
	{
		validate(13);
	}
	catch(Exception e)
	{
		System.out.println("Exception occured"+e);
	}
	}

}
