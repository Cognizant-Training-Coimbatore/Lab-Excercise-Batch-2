import java.util.Scanner;

public class exercise11_Q1 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = scanner.nextInt();
		if(n<0)
		{
			throw new ArithmeticException("negative value");
		}
		else
			System.out.println("the input is valid");

	}

}
