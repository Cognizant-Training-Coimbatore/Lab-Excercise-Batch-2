import java.util.Scanner;

public class program_10_odd_even
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("The number is even");
			
		}
		else
		{
			System.out.println("The number is odd");
			
		}
			
		

	}

}
