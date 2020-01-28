import java.util.Scanner;

public class loopQ4 {

	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		int num=5,j=1;
		for(int i=3;i>0;i++)
		{
			System.out.println("I'm thinking about a number between 0 and 9. Can you guess it? (You have 3 attempts left) ");
			int a=sc.nextInt();
			if(a!=num)
			{
				System.out.println("Sorry wrong number. 2 attempts left");
				System.out.println("I'm thinking about a number between 0 and 9. Can you guess it? (You have 2 attempts left) ");
				int a1=sc.nextInt();
			}
			
			if(a!=num)
			{
				System.out.println("Sorry wrong number. 1 attempts left");
				System.out.println("I'm thinking about a number between 0 and 9. Can you guess it? (You have 1 attempts left) ");
				int a1=sc.nextInt();
				
			}
			if(a!=num)
			{
				System.out.println("Sorry wrong number.The correct number is"+num);
				break;
				
			}
			if(a==num)
			{
				System.out.println("Correct");
				break;
			}
			
			
		}
		

	}

}
