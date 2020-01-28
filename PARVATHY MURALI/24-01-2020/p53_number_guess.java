import java.util.Scanner;

public class p53_number_guess 
{

	public static void main(String[] args) 
	{
		int number=10;
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("hai");
		while(count<3)
		{
			
			System.out.println("I'm thinking about a number between 0 and 9. Can you guess it?");
			int n=sc.nextInt();
			
			{
				if(n==number)
				{
					System.out.println("Congrats!! correct guess");
					System.exit(0);
				}
				else
				{
					System.out.println("Sorry.Wrong number.");
					
				}
				count++;
			}
			
		}
				System.out.println("Sorry.Wrong number.The correct number is "+number);
				
				
			
	

	}
}
