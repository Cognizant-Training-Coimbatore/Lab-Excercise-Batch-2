import java.util.Scanner;
public class program8_positive_neg
{

	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Number is negative");
		}
	}

}
