import java.util.Scanner;
public class ReverseNumber
{	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a number: ");
		int n=sc.nextInt();
		int number=n;
		do
		{	
			n=n/10;
		}while(n!=0);
	}
}
