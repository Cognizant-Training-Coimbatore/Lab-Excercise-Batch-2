import java.util.Scanner;

public class program_integers_between {

	public static void main(String[] args)
	{
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first integer");
		int a=scan.nextInt();
		System.out.println("Enter the second integer");
		int b=scan.nextInt();
		for(i=a+1;i<b;i++)
		{
			System.out.println(i);
		}
		

	}

}
