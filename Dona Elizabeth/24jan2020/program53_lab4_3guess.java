import java.util.Scanner;

public class program53_lab4_3guess {

	public static void main(String[] args) {
		int a,b=3,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("I’m thinking about a number between 0 and 9. Can you guess it?You have only 3 attempts");
		while(i<=3)
		{
			a=sc.nextInt();
			if(a==3)
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Sorry, Wrong answer");
				if(i==3)
				{
					System.out.println("The correct answer is 3!");
				}
				i++;
			}
			
		}
		
		
		
	}

}
