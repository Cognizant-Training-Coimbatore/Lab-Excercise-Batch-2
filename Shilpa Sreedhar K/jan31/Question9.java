package jan31;

public class Question9 {

	public static void main(String[] args) {

		int i,count,n=1,sum=0,cutoff=0;
		System.out.println("Prime numbers are: ");
		while(n<=1000)
		{
			count=0;
			i=2;
			while(i<=n/2)
			{
				if(n%i==0)
				{
					count++;
					break;
				}
				i++;
			}
			if(count==0 && n!=1)
			{
				System.out.println(n + "");
				sum=sum+n;
				cutoff++;
				if(cutoff==100)
					break;
				
			}
			n++;
		}
		System.out.println("sum: " +sum);
		

	}

}
