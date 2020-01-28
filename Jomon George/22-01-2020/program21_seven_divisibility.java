import java.util.Scanner;

public class program21_seven_divisibility
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%7==0)
		{
			System.out.println(num+" is Divisible by 7");
		}
		else
		{
			System.out.println(num+" is not divisible by 7");
		}

	}

}
