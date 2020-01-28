
import java.util.Scanner;
public class Fibanocci
{
	public static void main(String a1[])
	{	Scanner sc= new Scanner(System.in);
		System.out.print(" \n Enter a number ");
		int n=sc.nextInt();
		int a=0,b=1,s;
		if(n==1)
			System.out.println(" 0 ");
		else
		{	
			for(int i=0;i<n;i++)
			{	s=a+b;
				System.out.print(a+" ");
				a=b;
				b=s;
			}
			
		}	
	}
}
