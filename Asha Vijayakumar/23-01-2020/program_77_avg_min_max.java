import java.util.Scanner;
public class program_77_avg_min_max 
{

	public static void main(String[] args) 
	{
		
		int n,i,max,min;
		System.out.println("Enter the array limit:");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements to the array:");
		for(i=0;i<arr.length;i++)
		{
			arr[i] = scanner.nextInt();
			
		}
		for(i=0;i<n;i++)
		{
			max = arr[i];
			min = arr[i];
			if(arr[i] > max)
	        {
	            max = arr[i];
	        }

	        if(arr[i] < min)
	        {
	            min = arr[i];
			
	        }
		}
		
		
		System.out.println(max);
		System.out.println(min);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
