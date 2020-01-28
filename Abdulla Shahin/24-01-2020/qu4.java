import java.util.Scanner;

public class qu4 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number between 0 to 9 (to be guessed):");
		int value= sc.nextInt();
		int chance;
		
		System.out.println("guess the number(3 attempts left):");
		chance= sc.nextInt();
		if(chance == value)
		{
			System.out.println("right answer");
		}
		else
		{
			for(int i=2;i>0;i--)
			{
				System.out.println("sorry.Wrong answer..guess the number( "+i+" attempts left)" );
				chance= sc.nextInt();
				if(chance == value)
				{
					System.out.println("right answer");
					break;
				}
			}
			if(chance!=value)
			{
				System.out.println("sorry..wrong answer..the correct answer is:"+value);
			}
		}
		
	}
}
		
		