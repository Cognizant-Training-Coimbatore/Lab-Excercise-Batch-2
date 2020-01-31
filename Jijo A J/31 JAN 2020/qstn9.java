public class qstn9 {

	public static void main(String[] args) 
	{
		int i, sum,number, count; 
		sum=0;
		System.out.println(" sum of first 100 Prime Numbers ");	
		for(number = 1; number <= 542; number++)
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
		    	sum=sum+number;
		    }  
		}System.out.println(sum);
	}
}