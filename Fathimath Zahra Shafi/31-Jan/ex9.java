package practical_exercises;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i,j,sum=0;
		
		for( i=1;i<=100;i++)
		{  int flag=0;

				for(j=2;j<i;j++)
			{
				if(i%j==0)
				flag=1;
			}

		if(flag==0 && i==j)
			sum+=i;
		
		
	}
		System.out.println("sum: " +sum);

}}
