
import java.util.Scanner;
public class AddTwoNumbers
{
	public static void main(String a1[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Number");
		int a=sc.nextInt();
		System.out.println(" Enter another Number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(a+ " + "+b+" = "+ c);
	}
}