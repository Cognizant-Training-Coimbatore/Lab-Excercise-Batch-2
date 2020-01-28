
import java.util.Scanner;

public class program_76_order_btw_two_integers 
{

	public static void main(String[] args)
	{
		int a,z,i;
		System.out.println("Enter the starting integer:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("Enter the ending integer:");
		
		z = scanner.nextInt();
		for(i=a+1;i<z;i++)
		{
			System.out.println(i);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
