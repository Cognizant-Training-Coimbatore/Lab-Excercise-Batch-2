package project1;

public class prgd31_q9 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int count=1; 
		int a=2;
		int sum=0;
		while(count<=100)
		{
			int c=0,i=1;
			while(i<=a)
			{
				if(a%i==0)
				{
					c++;
				}
				i++;
			}
			
			
			if(c==2)
			{
				sum=sum+a;
				count++;
			}
			a++;
		}
		System.out.println("sum is :" +sum);
	}

}
