package practical_excercise;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,c=0,sum=0,sum1=0;
		for(i=1;sum!=100;i++)
		{
			c=0;
			for(j=2;j<i;j++)
			{ 

				if(i%j==0)
					{ c=c+1;}
			}
			if(c==0 &&i==j)
			{ 
//				System.out.println(i);
				sum=sum+1;
				sum1=sum1+i;
			
			    }
		}
		System.out.println(sum1);

	}

}
