import java.util.Scanner;
public class program_80_guess 
{

	public static void main(String[] args) 
	{
		int i,N,a;
		System.out.println("Enter an integer");
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		System.out.println("The guessed number");
		a=scanner.nextInt();
		if(a==N)
		{
			System.out.println("your guesses answer is write");
			
		}
		else
		{
			for(i=3;i>=1;i--)
			{
				System.out.println("The no: of attempts left :"+ i);
				
			}
			System.out.println("No more attempts");
			
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
