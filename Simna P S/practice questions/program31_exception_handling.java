
public class program31_exception_handling 
{

	public static void main(String[] args) 
	{
		try
		{
			int a=10,b=5,c=5;
			int result;
			result = a/(b-c);
		}
		catch(Exception e)
		{
			System.out.println("Error in the code "+e);
		}
		System.out.println("Out of the block");
	}

}
