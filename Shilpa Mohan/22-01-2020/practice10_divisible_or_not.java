import java.util.Scanner;

public class practice10_divisible_or_not {

	public static void main(String[] args) 
	{
		int a=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		a=sc.nextInt();
		if(a%7==0)
		{
			System.out.println("The number is divisible by 7.");
		}
		else
		{
			System.out.println("The number is not divisible by 7.");
		}
	}

}
