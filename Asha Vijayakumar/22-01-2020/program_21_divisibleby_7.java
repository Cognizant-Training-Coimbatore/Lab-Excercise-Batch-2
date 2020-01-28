import java.util.Scanner;

public class program_21_divisibleby_7 
{

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		if(num % 7==0)
		{
			System.out.println("The number is divisible by 7");
			
		}
		else
		{
			System.out.println("The number is not divisible by 7");
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
