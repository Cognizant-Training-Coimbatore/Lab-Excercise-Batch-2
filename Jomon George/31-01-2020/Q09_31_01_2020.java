package Exercise;

public class Q09_31_01_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0,i,j,sum=0;
		for(i=2;i<=100;i++)
		{
			for(j=2;j<=(i/2);j++)
			{
				if((i%j == 0))
				{
					flag=1;
					break;
				}
				else
					flag=0;
			}
			if(flag == 0)
				sum+=i;
		}
		System.out.println(sum);
	}

}
