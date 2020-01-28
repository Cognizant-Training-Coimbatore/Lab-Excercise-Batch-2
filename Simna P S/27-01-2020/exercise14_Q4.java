import java.util.Scanner;

public class exercise14_Q4 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = scanner.nextInt();
		try
		{
			int a[]=new int[5];
			a[5]=n;
			System.out.println(a[6]/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds exception occurs");
		}
		finally
		{
			System.out.println(n/2);
		}

	}

}
