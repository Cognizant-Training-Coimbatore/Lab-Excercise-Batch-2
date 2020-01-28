import java.util.Scanner;

public class program_count {

	public static void main(String[] args) 
	{
		int i,n,count=0;
		System.out.println("Enter the array size");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("The elememts of the array are:");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				count++;
			}
			
		}
		System.out.println("The count of odd number is:"+count);
		
		
		
		
		
		

	}

}
