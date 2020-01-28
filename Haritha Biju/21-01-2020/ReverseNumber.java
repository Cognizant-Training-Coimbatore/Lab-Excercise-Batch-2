import java.util.Scanner;
public class ReverseNumber
{	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a number: ");
		int n=sc.nextInt();
		System.out.print("\n The reversed number is : ");
		do
		{	System.out.print(n%10);
			n=n/10;
		}while(n!=0);
	}
}
