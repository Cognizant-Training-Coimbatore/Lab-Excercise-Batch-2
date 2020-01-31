package java50;

public class qu9_sumprime {

	public static void main(String[] args) 
	{
		int number,count=0,sum=0,flag=0;
		while(count<=100)
		{
		for(int i=2;i<545;i++)
		{
			if(i==0||i==1)
			{
				continue;
			}
			flag=1;
			
		
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==2)
				{
					flag=0;
					break;
				}
			}
				if (flag==1)
				{
					
					sum=sum+i;
					count++;
				}
			}
		
			
						
			}
		
		System.out.println(sum);
	}
   
       
    }

	


