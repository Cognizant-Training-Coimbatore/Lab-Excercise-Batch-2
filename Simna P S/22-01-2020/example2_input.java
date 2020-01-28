import java.util.Scanner;

public class example2_input 
{

	public static void main(String[] args)
	{
		int n=5,a,b,c,d,e, sum,average;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number");
		a = scanner.nextInt();
		System.out.println("enter the second number");
		b = scanner.nextInt();
		System.out.println("enter the third number");
		c = scanner.nextInt();
		System.out.println("enter the forth number");
		d = scanner.nextInt();
		System.out.println("enter the fifth number");
		e = scanner.nextInt();
		sum=a+b+c+d+e;
		average=sum/5;
		System.out.println("The sum is "+ sum);
		System.out.println("The average is "+ average);

	}

}
