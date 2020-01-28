import java.util.Scanner;

public class program10_odd_even 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number==0)
		{
		
			System.out.println(number+" is neither an odd nor an even number");
		}
		else if(number%2==0)
		{
			System.out.println(number+" is a even number ");
		}
		else
		{
			System.out.println(number+" is a odd number");
		}

	}

}
