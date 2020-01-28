import java.lang.*;
public class prog71_trycatch 
{

	public static void main(String[] args) 
	{
		try
		{
			int a=10, b=3,c=3;
				int d=a/(b-c);
				
		}
		catch(Exception e)
		{
			System.out.println("Error in the code"+e);
		}
		System.out.println("Out of block");
	}

}
