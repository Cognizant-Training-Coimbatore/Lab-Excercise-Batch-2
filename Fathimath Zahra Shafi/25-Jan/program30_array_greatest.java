import java.util.Scanner;

public class program30_array_greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int n,max=0,i;
		System.out.println("enter max size");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("enter number "+i);
			arr[i]=scanner.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println("numbers are: " +arr[i]);
		}
		System.out.println("greatest number: " +max);
		
	}

}
