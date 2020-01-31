package exceptionhandling;

public class pgm04_27_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[2];
		try
		{
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown..."+e);
		}
		finally
		{
			a[0]=6;
			System.out.println("First element : "+a[0]);
		}
	}

}
