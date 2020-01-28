import java.util.Scanner;

public class qstn4 
{
	static void validate(String s)throws NullPointerException
	{
		if(s.length()==0)
		{
			System.out.println("String cant be null");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int x =sc.nextInt();
		try
		{
			int a[]= new int[5];
			a[5]=x;
			System.out.println(a[6]/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception Occurs");
		}
		finally
		{
			System.out.println(x/1);
		}

	}

}
