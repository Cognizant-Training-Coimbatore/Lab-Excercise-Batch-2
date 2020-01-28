import java.util.Scanner;

public class program_81_sum_avg_like 
{

	public static void main(String[] args)
	{
		int i,sum=0,avg;
		System.out.println("Enter the size of array:");
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int[] a=new int[N];
		for(i=0;i<N;i++)
		{
			a[i]=scanner.nextInt();
			
		}
		for(i=0;i<N;i++)
		{
			if(a[i]==999)
			{
				for(i=0;i<N;i++)
				{
					sum+=a[i];
					
				}
				avg=sum/N;
				System.out.println("sum is:" +sum);
				System.out.println("average is:" +avg);
				
			}
			else
			{
				System.out.println(a[i]);
				
			}
		}
		// TODO Auto-generated method stub

	}

}
