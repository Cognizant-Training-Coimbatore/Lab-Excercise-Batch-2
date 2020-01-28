import java.util.Scanner;

public class practice4_positive_negative {

	public static void main(String[] args) 
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=sc.nextInt();
		if(a==0)
		{
			System.out.println("The number is not positive and not negative");
		}
		else if(a<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is positive");
		}
	}

}
