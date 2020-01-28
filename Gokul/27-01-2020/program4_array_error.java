import java.util.Scanner;

public class program4_array_error {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	System.out.println("Enter the first number ");
	int n1=sc.nextInt();
	System.out.println("Enter second number ");
	int n2=sc.nextInt();
	
	int a[]=new int[5];
	
	
	try
	{
		a[5]=n1/n2;
		
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("Artithmetic Exception occurs");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBounds Exception occers");
		
	}
	catch(Exception e)
	{
		System.out.println("Parent Exception occurs");
	}
finally
{
	a[0]=6;
	System.out.println("The first element of the array is "+a[0]);
}
	
	

	}

}
