
public class Exceptionex1 {

	public static void main(String[] args) 
	{
		try
		{
			int a=10, b=5, c=5;
			int result;
			result=a/(b-c);
			
		}
		catch(Exception e)
		{
			System.out.println("Error in code" +e);
		}
		System.out.println("Out of block");
	}

}
