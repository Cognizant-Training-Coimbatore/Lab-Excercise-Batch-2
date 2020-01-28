import java.util.Scanner;

public class program8_positive
{

	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter your Number");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if(x>=0)
		{
		System.out.println("Your number is postive");
		}
		else
		{
			System.out.println("Your number is negative");
			}
	
	}
}
