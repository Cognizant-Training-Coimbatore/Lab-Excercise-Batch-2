package jan31;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, number, count,sum=0,cut=0; 
		
		System.out.println(" Prime Numbers from 1 to 100 are : ");	
		for(number = 1; number <= 10000; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    	
		    	sum=sum+number;
		    	cut++;
		    	
		    	if(cut==100) {
		    		break;
		    	}
		    }  
		    
		    
		}
		System.out.println("\nSum of prime numbers is : " +sum);

	}

}
