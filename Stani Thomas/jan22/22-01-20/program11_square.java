import java.util.Scanner;

public class program11_square {

	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for a");
		a=sc.nextInt();
		System.out.println("enter the value for b");
		b=sc.nextInt();
		System.out.println("("+a+"+"+b+")^2 = "+((a+b)*(a+b)));
		

	}

}
