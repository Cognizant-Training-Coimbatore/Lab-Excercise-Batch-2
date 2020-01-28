
import java.util.Scanner;
public class Primenumbers
{
	public static void main(String a1[])
	{	Scanner sc= new Scanner(System.in);
		System.out.print(" \n Enter a number ");
		int n=sc.nextInt();
		int c=0;
		System.out.print(" \n Prime numbers till "+n+" are : ");
		for(int i=1;i<=n;i++)
		{	for(int j=2;j<=i/2;j++)
			{	if(i%j==0)
					c++;
			}
			if(c==0)
				System.out.print(i+ " ");
			c=0;
		}
		
	}
			
}