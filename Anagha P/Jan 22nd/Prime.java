import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		int n,i,flag=0;
		System.out.println("enter the number\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("\n number is prime");
		}
		else
			System.out.println("\nnot prime");
	}
}