import java.util.Scanner;

public class Program51 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num =5,i,n;
		System.out.println("I'm thinking about a number between 0 and 9. Can you guess it?( 3 attempt(s) left)");
		for(i=3;i>0;i--)
		{
				
				n=sc.nextInt();
				if(n==num)
				{
					System.out.println("Success");
				
				}
				else
				{
					System.out.println("Sorry. Wrong number. I'm thinking about a number between 0 and 9. Can you guess it?( " +(i-1)+ "attempt(s) left)");
				}
		}
		if(i==0)
		{
			System.out.println("Sorry. Wrong number.The correct number is 5");
		}

	}

}
