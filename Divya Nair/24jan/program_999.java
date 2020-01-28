import java.util.Scanner;

public class program_999 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,sum=0,avg;
		System.out.println("Enter the size of the array");
		Scanner scan=new Scanner (System.in);
		int N=scan.nextInt();
		int[] a=new int[N];
		for(i=0;i<N;i++)
		{
			
			a[i]=scan.nextInt();
		
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
				System.out.println("sum is:"+sum);
				System.out.println("Avg is:"+avg);	
			}
			else
			{
				System.out.println(a[i]);
			}
			
		}
		
		

	}

}
