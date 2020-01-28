
public class program_31_exception_d 
{
	public static void main(String[] args)
	{
		int a[]=new int[2];
		try
		{
			System.out.println("Access the third element"+a[3]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Thrown"+e);
		}
		finally
		{
			a[0]=6;
			System.out.println("First Element Value "+a[0]);
			System.out.println("The finally statement is executed");
		}
	}
}

