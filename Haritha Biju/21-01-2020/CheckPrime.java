
import java.util.Scanner;
public class CheckPrime
{
	public static void main(String a1[])
	{	Scanner sc= new Scanner(System.in);
		System.out.print(" \n Enter a number ");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<=n/2;i++)
			if(n%i==0)
				c++;
		if(c==0)
			System.out.print(n+" is a prime number ");
		else
			System.out.print(n+" is not a prime number ");
	}
		
}