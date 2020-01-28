import java.util.Scanner;

public class prob2 {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter two numbers");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			float d=n/m;
			System.out.println("Result is " + d);
			
		}
		catch(ArithmeticException m)
		{
			System.out.println("Arithmetic Exception occurs");
		}
	}

}
