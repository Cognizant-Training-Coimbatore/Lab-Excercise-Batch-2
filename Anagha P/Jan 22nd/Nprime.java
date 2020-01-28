import java.util.Scanner;
public class Nprime
{
	public static void main(String args[])
	{
		int n,i,j,m,flag;
		System.out.println("enter the start number\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("\nenter last number\n");
		m=sc.nextInt();
		for(i=n;i<=m;i++)
		{
			flag=0;
			for(j=2;j<i/2;j++)
			{
				if(i%j == 0)
				{
					flag=1;
					break;					
				}
			}
				if(flag==0)
				{
					System.out.println("\n"+i);
				}
			
		}
	}
}	