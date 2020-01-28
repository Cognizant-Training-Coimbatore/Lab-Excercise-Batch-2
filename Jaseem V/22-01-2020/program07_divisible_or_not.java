import java.util.Scanner;

public class program07_divisible_or_not {

	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		if(x%7==0)
		{
			System.out.println("The given number is divisible by 7");
		}
		else
		{
			System.out.println("The given number is not divisible by 7");
		}

	}

}
