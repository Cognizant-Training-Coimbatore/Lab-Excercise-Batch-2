package exceptionhandling;

public class pgm03_27_catchblocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[5]=10/10;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception thrown....."+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown....."+e);
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown....."+e);
		}
	}

}
