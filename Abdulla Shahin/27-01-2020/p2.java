import java.util.Scanner;

public class p2 {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("enter two nos");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			float d = n/m;
			System.out.println("result is "  + d);
		}
		catch(ArithmeticException m)
		{
			System.out.println("Arithmetic Exceptio occurs");
		}

	}

}
