import java.util.Scanner;

public class exc4 {

	public static void main(String[] args) 
	{
		int ar[]=new int[5];
		int num=0;
		try
		{
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter fst number: ");
			int a= sc.nextInt();
			System.out.println("Enter 2nd number: ");
			int b=sc.nextInt();
		    num=a/b;
			ar[0]=num;
			System.out.println("RESULT: "+ar[6]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occur- division by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown "+e);
	    }
		finally
		{
			ar[0]=num;
			System.out.println("element value: "+ar[0]);
			System.out.println("The finally is executed");
		}
		
	}
}


