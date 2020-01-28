
public class rray_index_exception {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		try
		{
			
			System.out.println("Access 6 elements"+a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown" +e);
		}
		finally
		{
			
			a[0]=6;
			System.out.println("First value:" +a[0]);
			System.out.println("The finally statement is executed");
		}


	}

}
