import java.util.Scanner;

public class exercise12_Q2 
{

	public static void main(String[] args) 
	{
		int n,m;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		n = scanner.nextInt();
		m = scanner.nextInt();
		if(m==0)
		{
			throw new ArithmeticException("division not possible");
		}
		else
			System.out.println("solution is :"+n/m);


	}

}
