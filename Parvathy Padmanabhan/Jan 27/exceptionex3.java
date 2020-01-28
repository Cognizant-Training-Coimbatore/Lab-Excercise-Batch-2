
public class exceptionex3 {

	public static void main(String[] args) {
		int a[] = new int[3];
		try
		{
			a[3]=5/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array :" +e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic : ");
		}
		catch(Exception e)
		{
			System.out.println("Parent:");
		}
	}

}
