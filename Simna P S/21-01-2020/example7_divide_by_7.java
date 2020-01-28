import java.util.Scanner;

public class example7_divide_by_7 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		num = scanner.nextInt();
		if(num%7==0)
		{
			System.out.println("The number is divisible by 7");
		}
		else
		{
			System.out.println("The number is not divisible by 7");
		}

	}

}
