import java.util.Scanner;

public class Q18 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();
		if((a==b)&&(b==c))
		{
			System.out.println("All numbers are equal");
		}
		else if((a!=b)&&(b!=c)&&(a!=c))
		{
			System.out.println("All numbers are different");
		}
		else
		{
			System.out.println("Neither all are equal or different");
		}

	}

}
