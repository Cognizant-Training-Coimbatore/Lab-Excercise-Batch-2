
public class prog46 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occur");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound exception occirs");
		
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occurs");
		}
	}

}
