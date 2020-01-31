package jan31;

public class ques9 {

	public static void main(String[] args) 
	{
		int sum=0,count=0;
		
		for(int i=2;i<=542;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j == 0)
				{	
					count=1;
					break;
				}
				else
				{
					count =0;
				}
			}
			
				if(count==0)
				{
					sum = sum+i;
				}
		}
		System.out.println(sum);

	}

}
