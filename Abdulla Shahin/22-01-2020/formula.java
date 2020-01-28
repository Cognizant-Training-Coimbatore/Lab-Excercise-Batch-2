import java.util.Scanner;

public class formula {

	public static void main(String[] args)
	{
		System.out.println("enter the first number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter the first number:");
		int b=sc.nextInt();
		int c=(a*a)+(b*b)+(2*a*b);
		System.out.println("value: "+c);
	}

}
