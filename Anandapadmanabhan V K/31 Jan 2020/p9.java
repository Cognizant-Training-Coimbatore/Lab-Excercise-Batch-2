
public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, number = 1, count,sum=0; 
		while(number <= 100)
		{
			count = 0;
			i = 2;
		    while(i <= number/2 )
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    	i++;
		    }
		    if(count == 0 && number != 1 )
		    {
		    	sum=sum+number;
		    }
		    number++;

		}
		System.out.println(sum);
	}
}
