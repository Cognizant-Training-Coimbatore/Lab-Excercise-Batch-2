import java.util.Scanner;

public class prog52_max_min
{

	public static void main(String[] args)
	{
		int min,max,sum=0,i;
		double avg=0;
		Scanner scanner = new Scanner(System.in);
		int a[]=new int[10];
		 
			System.out.print("Enter 10 numbers:");  
			
			for(i=0; i<10; i++)
			{
	
			a[i]=scanner.nextInt();
			}
			
			min=max=a[0];
		
				
		        
		        	for(i=0;i<10;i++)
		        	{
		        		if (a[i]<min) 
		        		{
		        			min=a[i];
		        			
		        		}
		        		if (a[i]>max)
		        		{max=a[i];
		        		
		        		}
		        		sum=sum+a[i];
		        		
		        	}
		        	avg=sum/10;
		        	System.out.println("min of numbers is: " +min);
		        	System.out.println("max of numbers is " +max);
		        	System.out.println("avg= " +avg);
		        
		        
				
		// TODO Auto-generated method stub

	}

}
