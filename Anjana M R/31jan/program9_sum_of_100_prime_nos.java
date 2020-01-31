
public class program9_sum_of_100_prime_nos {

	public static void main(String[] args) {
		int n=1, sum=0;
		int i,j,flag=0;
		System.out.println("prime numbers");
		while(n<=100)
		{ 
			int count=0;
			for(i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					count++;
					break;
					
				}
			}
			if(count==0 && n!=1)
			{
				System.out.println(n+"");
				sum=sum+n;
			}
			n++;
		}
		System.out.println(sum);
		}
		
	}

			