
public class question9
{
	public static void main(String args[])
	{
	  int num=3,count=1;
	  for(int i=2;i<=100;)
	  {
		for(int j=2;j<=num/2;j++)
		{
			if(num%j==0)
			{
				count=0;
				break;
			}
			if(count!=0)
			{
				System.out.println(num);
				i++;
			}
			num++;
			count=1;
		}
	  }
	}
}
