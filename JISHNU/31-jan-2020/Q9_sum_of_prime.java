
public class Q9_sum_of_prime 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int sum=2,i,j;
		int count = 1;
		
		for(i=3;count<100;i++) 
		{	
			int f=0;
			for(j=2;j<=i/2;j++)
				{
					if(i%j==0)
						f=1;	
				}
				if(f==0)
				{
					sum=sum+i;
					count++;
				}
				}
			System.out.println("\n"+sum);
				
}
}
