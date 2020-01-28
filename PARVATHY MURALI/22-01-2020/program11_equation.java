import java.util.Scanner;

public class program11_equation 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter value of a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		System.out.println("The Result of ("+a+"+"+b+")^2="+((a+b)*(a+b)));
	}

}
