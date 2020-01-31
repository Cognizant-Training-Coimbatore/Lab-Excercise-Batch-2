

public class j31_q9_SieveOfEratosthenes {

	public static void main(String[] args) 
	{
		int sum =1;//1 is the first prime number
		int count=1;
		int n=0;
		do
		{
		    n++;//lets say 33
			if(n%2!=0)
			{
				//to check if the number is even
				if(is_Prime(n)) //(yes/no) is returned from the "is_Prime" function
				{
					sum+=n;
					count++;
				}
			}
			
		}
		while(count<=100);
		System.out.println("sum of the first 100 prime numbers :"+sum);
	}
	
	public static boolean is_Prime(int n)//33
	{
		//to find whether the passed number is prime or not
		
		for(int i=3;i*i<=n;i+=2) /*  (i+=2) is done since even numbers can be excluded
		
		                             (i*i) no need to check the rest  */
		{
			if(n%i==0) 
			{
				return false;//not a prime
			}
		}return true;//a prime
		
	}
	
}
