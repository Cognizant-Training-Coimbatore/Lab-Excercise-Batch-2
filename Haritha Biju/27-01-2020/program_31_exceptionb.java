
public class program_31_exceptionb
{

	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[2];
			System.out.println("Access the third element"+a[3]);
			
		}
		catch (ArrayIndexOutOfBoundException e)
		{
			System.out.println("Exception Thrown"+e);
		}
		System.out.println("Out of the block");

	}

}
