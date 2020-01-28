import java.util.Scanner;
public class Digits
{	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a number");
		int n=sc.nextInt();
		int c=0,number=n;
		while(n!=0)
		{	n/=10;
			c++;
		}
		System.out.println(" The number of digits in the number "+number+ " is "+c);
	}
}
			