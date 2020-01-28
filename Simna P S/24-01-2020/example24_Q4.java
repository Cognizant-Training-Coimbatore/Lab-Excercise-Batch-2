import java.util.Scanner;

public class example24_Q4 
{

	public static void main(String[] args) 
	{
		int range=9, i,n,flag=0;
		Scanner scanner = new Scanner(System.in);
		int rand = (int)(Math.random() * range);
		System.out.println("I am thinking about a number between 0 and 9. Can you guess it?( 3 attepts left!)");
		for(i=1;i<=3;i++)
		{
			n= scanner.nextInt();
			if(n==rand)
			{
				flag=1;
				System.out.println("Correct answer....yay!!!");
				break;
			}
			else if(i!=3)
			{
				
				System.out.println("Sorry wrong answer.Try your luck again...( "+(3-i)+" attepts left!)");
			}
			
		}
		if(flag==0)
		{
			System.out.println("Sorry. Wrong number. The correct number is "+rand);
		}

	}

}
