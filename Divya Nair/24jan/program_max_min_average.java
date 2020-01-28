

public class program_max_min_average {

	public static void main(String[] args) 
	{
		int i,sum=0,avg;
		int arr[]=new int[] {20,30,50,10,80,90,100,40,5,7};
		int max=arr[6];
		int min=arr[8];
		
		
		for( i=1;i<10;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			
			}
			else if(arr[i]<min) 
			{
				min=arr[i];
			
			}
		}
		for(i=1;i<10;i++)
		{
			sum+=arr[i];
			
			
		}
		avg=sum/10;
		for(i=0;i<arr.length;i++)
		{
			System.out.println("The array elements are:"+arr[i]);
		}
		System.out.println("Maximum number is :"+max);
		System.out.println("Minimum number:"+min);
		System.out.println("average:"+avg);


	}

}
