import java.util.Scanner;

public class prog55_sum_avg_999
{

	public static void main(String[] args) 
	{
		int a,sum=0,i=0,c=0;
		double avg=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		a=s.nextInt();
		while (a!=999)
		{
			System.out.println("Enter next number:");
			a=s.nextInt();
			sum=sum+a;
			c=i++;
			
			
		}
		avg=sum/c;
		System.out.println("sum = " +sum);
		System.out.println("avg =  " +avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
