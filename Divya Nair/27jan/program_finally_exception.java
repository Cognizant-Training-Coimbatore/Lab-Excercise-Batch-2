
public class program_finally_exception {

	public static void main(String[] args) 
	{
		int a[]=new int[2];
		try
		{
			System.out.println("Access 3 elements:"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Exceptionthrown:" +e);
		}
		finally
		{
			a[0]=6;
			System.out.println("First value:" +a[0]);
			System.out.println("The finally statement is executed");
		}

	}

}
