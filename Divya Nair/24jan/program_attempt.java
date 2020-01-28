import java.util.Scanner;

public class program_attempt {

	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter an integer");
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		System.out.println("Guessed number");
		int a=scan.nextInt();
		
		
			if(a==N)
			{
			System.out.println(" Right Answer");
			}
			else
			{
				System.out.println("Wrong Answer");
				for( i=3;i>1;i--)
				{	
					a=scan.nextInt();
					if(a!=N)
					{
						System.out.println("Wrong Answer");
						System.out.println("The no of attempts left:" +i);	
					}
					else 
					{
						System.out.println(" Right Answer");
					}
					
				}
			
				System.out.println("No more attempts");
			}
		
	
			
		
		

	}

}
