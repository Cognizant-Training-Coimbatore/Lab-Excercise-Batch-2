
public class program_exception_array {

	public static void main(String[] args) 
	{
		
		try
		{
			int a[]=new int[2];
			System.out.println("Access 3 elements"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception thrown" +e);
		}
		System.out.println("success");

	}

}
