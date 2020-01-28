
public class p72_arrayexeption 
{

	public static void main(String[] args)
	{
		
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arthemetic Execption occurs");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBound Execption occurs");
		}
		catch (Exception e)
		{
			System.out.println("Parent Execption occurs");
		}
	}
	

}
