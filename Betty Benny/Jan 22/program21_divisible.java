import java.util.Scanner;

public class program21_divisible 
{

	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		if(a%7==0)
		{
			System.out.println(a+ " is divisble by 7");
		}
		else
		{
			System.out.println(a+ " not divisble by 7");
		}


	}

}
