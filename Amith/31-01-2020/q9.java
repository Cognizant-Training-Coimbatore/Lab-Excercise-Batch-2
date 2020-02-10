package java50programs;

public class q9 {

	public static void main(String[] args) 
	{
		int i,j,flag;
		int sum=0;
		int t=0;
		while(t<=100)
		{
	
		for(i=0;i<600;i++)
		{
			if(i==0||i==1)
			{
				continue;
			}
			flag=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==2)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
			sum=sum+i;
			t++;
			
			}
		}
		}
		System.out.println(sum);
	}

}
