import java.util.Scanner;

public class exercise15_Q5 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the mark");
		n = scanner.nextInt();
		
		if(n<0)
		{
			throw new ArithmeticException("invalid mark entered");
		}
		else
			System.out.println("Mark :"+n);


	}

}
