import java.util.Scanner;

public class example7_algebra 
{

	public static void main(String[] args)
	{
		int a, b, sum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the a");
		a = scanner.nextInt();
		System.out.println("Enter the b");
		b = scanner.nextInt();
		sum= a*a+b*b+2*a*b;
		System.out.println("The result obtained is: "+ sum);
	}

}
