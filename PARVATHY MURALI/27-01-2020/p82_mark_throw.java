import java.util.Scanner;

public class p82_mark_throw
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of subject:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the mark of subject:");
		
		for(int i=0;i<n;i++)
		{
			int m=sc.nextInt();
			
		
		if (m<0)
		{
			throw new ArithmeticException("invalid mark...please enter positive number");
			
		}


			
		}
		
	}

}
