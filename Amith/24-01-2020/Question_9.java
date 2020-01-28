import java.util.Random;
import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter maximum range");
		int num=sc.nextInt();
		Random rand= new Random();
		for(int i=0;i<7;i++)
		{
			System.out.println(rand.nextInt(num));
		}
	}

}
