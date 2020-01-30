import java.util.Scanner;

public class Program53 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int i,n,N,avg,count=0,sum=0;
		System.out.println("Enter the total 'N'");
		N=sc.nextInt();
		for(i=0;i<N;i++)
		{
			n=sc.nextInt();
			if(n==999)
			{
				break;
			}
			sum=sum+n;
			count++;
		}
			avg=sum/count;
			System.out.println("sum = "+sum);
			System.out.println("Average= "+avg);
	}

}

