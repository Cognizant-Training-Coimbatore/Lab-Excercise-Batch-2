
public class program_31_execption_c 
{

	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch (ArithmaticException e)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBound Exception Occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Execption Occurs");
		}
		

	}


}
