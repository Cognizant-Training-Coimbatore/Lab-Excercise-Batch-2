
public class q9 {

	public static void main(String[] args) 
	{
		int t=0,s=0;
		int i,j,flag;
		while(t<=100)
		{
			for( i=0;i<=600;i++)
			{
				
				if(i==0 || i==1)
				{
					continue;
				}
				flag=1;
				for( j=2;j<=i/2;j++)
				{
					if(i%j==2)
					{
						flag=0;
						break;
					
					}
				
				}
				if(flag==1)
				{
					s=s+i;
					t=t+1;
				}
			}
		}
		System.out.println(s);
	}

}
