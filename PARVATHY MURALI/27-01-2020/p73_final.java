
public class p73_final 
{

	public static void main(String[] args)
	{
		int a[]=new int[2];
		try
		{
			System.out.println("Access element 3"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Eception throw:"+e);
		}
		finally
		{
			a[0]=9;
			System.out.println("First element vslue:"+a[0]);
			System.out.println("The final statement is executed"
					);
			
		}
	}
	

}
