
import java.util.Scanner;
public class ComparingNumbers
{
	public static void main(String a1[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Number");
		int a=sc.nextInt();
		System.out.println(" Enter another Number");
		int b=sc.nextInt();
		if(a>b)
			System.out.println(a+ " is greater ");
		else
			System.out.println(b+ " is greater ");
	}
}