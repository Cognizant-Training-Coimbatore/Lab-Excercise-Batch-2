import java.util.Scanner;

public class prog54_999 
{

	public static void main(String[] args) 
	{
		int sum=0, c=0;
		Scanner sc=new Scanner(System.in);
		int f=0;
		System.out.println("Enter list:");
		while(f==0)
		{
			int n=sc.nextInt();
			sum=sum+n;
			if(n==-999)
			{
				f=1;
			}
			c++;
			
		}
		System.out.println("Sum="+sum);
		System.out.println("Avg="+sum/c);
		
		
		
			
	}

}
