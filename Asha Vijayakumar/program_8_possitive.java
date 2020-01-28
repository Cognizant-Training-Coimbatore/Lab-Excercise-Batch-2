import java;
import java.util.Scanner;

public class program_8_possitive 
{

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		if(num<0)
		{
			System.out.println("The number is negative");
			
			
		}
		else
		{
			System.out.println("The number is possitive");
			
		}
		if(num==0)
		{
			System.out.println("The number is neither possitive nor negative");
			
		}
		// TODO Auto-generated method stub

	}

}
