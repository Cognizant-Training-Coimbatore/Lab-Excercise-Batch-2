import java.util.Scanner;

public class prog91_array_exception {

	public static void main(String[] args) 
	{
		
		try
		{
			Scanner sc = new Scanner(System.in);
			int a,b;
			int ar[]=new int[5];
			System.out.println("Enter a number: ");
			a=sc.nextInt();
			System.out.println("Enter another number: ");
			b=sc.nextInt();
			int result;
			result=a/b;
			System.out.println("Result : "+result);
			ar[5]=result;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error encounterd...."+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error encounterd....."+e);
		}
		finally
		{
			System.out.println("Finally block is executed...");
		}
	}

}