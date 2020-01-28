package Package2;

public class program77_multiple_catch_block {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}

	}

}
