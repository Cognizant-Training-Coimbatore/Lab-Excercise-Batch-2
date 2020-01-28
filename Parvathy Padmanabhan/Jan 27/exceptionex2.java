
public class exceptionex2 {

	public static void main(String[] args)
	{
		try
		{
			int a[]=new int[2];
			System.out.println("Access three :" +a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception: " +e);
		}
		System.out.println("Out of Block");
	}

}
