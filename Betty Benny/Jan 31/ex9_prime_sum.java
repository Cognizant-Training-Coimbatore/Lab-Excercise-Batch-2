
public class ex9_prime_sum {

	public static void main(String[] args) 
	{
		int c=0,n=2,sum=0;
		while(c<=100)
		{
			int f=0;
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					f=1;
				}
				
			}
			if(f==0)
			{    System.out.println(n);
				sum=sum+n;
				c++;
			}
			n++;
		}
		System.out.println("sum = "+sum);
		
	}

}
