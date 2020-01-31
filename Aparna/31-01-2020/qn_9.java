package practical_exercises;

public class qn_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,sum=0;
		for(i = 1; i <= 100; i++)
		{
			int count = 0;
		    for (j = 2; j <= i/2; j++)
		    {
		    	if(i % j == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && i != 1 )
		    {
		    	 sum=sum+i;
		    	System.out.print(i + " ");
		    }  
		}
		System.out.println("");
		
		System.out.print( "The sum is "+sum);
}
	}


