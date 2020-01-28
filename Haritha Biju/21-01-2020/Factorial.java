
import java.util.Scanner;
public class Factorial
{
	public static void main(String a1[])
	{	Scanner sc= new Scanner(System.in);
		System.out.print(" \n Enter a number ");
		int n=sc.nextInt();
		int f=1;
		if(n>=0)
		{	for(int i=1;i<=n;i++)
				f*=i;
				
			System.out.print(" "+n+"! = "+f);
		}
		else 
			System.out.print(" \n Invalid Input ");
	}
			
}