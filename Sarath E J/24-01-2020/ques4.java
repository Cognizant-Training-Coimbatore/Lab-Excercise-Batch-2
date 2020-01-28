import java.util.Random;
import java.util.Scanner;

public class program41 {

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("i am thinking a number between 0 and 9.Can u guess it?(3 attempts left)");
		Random  r = new Random();
		int guess = r.nextInt(10);
		
		for(int i=3;i>0;i--)
		{
			
			n = sc.nextInt();
			if(n==guess)
			{
				System.out.println("correct");
				sc.close();
				return;
			}
			else if(i==1)
			{
				System.out.println("Sorry.Wrong number.Correct answer ="+guess);
			}
			else
			{
				System.out.println("Sorry.Wrong number.i am thinking a number between 0 and 9.Can u guess it?("+i+" attempts left)");
			}
		}
		sc.close();

	}

}
