import java.util.Scanner;

public class exc2 {

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter fst number: ");
			int a= sc.nextInt();
			System.out.println("Enter 2nd number: ");
			int b=sc.nextInt();
			float num=a/b;
			System.out.println("RESULT: "+num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occur- division by zero");
		}
	}

}
