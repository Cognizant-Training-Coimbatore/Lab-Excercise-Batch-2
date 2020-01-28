import java.util.Scanner;

public class program21_divisible_7 {

	public static void main(String[] args) 
	{
		int num;
		System.out.println("enter number");
		Scanner scanner= new Scanner(System.in);
		num=scanner.nextInt();
		if(num%7==0)
		{
			System.out.println("number is divisible by 7");
		}
		else
		{
			System.out.println("number is not divisible by 7");
		}

	}

}
