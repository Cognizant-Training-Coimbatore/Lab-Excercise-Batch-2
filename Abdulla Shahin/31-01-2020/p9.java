
public class p9 {

	public static void main(String[] args) 
	{
		int i = 1,j,flag=0,sum=0,count=0;
		for(;i<101;i++)
		{
			for(j=1;j<i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count == 0 && i!=1)
			{
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
	}

}
