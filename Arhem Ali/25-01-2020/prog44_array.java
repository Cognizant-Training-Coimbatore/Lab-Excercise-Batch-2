import java.util.Scanner;

public class prog44_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size: ");
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter values: ");
			int b=sc.nextInt();
			arr[i]=b;
		}
		int grt=arr[0];
		for( int i=0;i<n;i++)
		{
			if(arr[i]>grt)
			{
				grt=arr[i];
			}
		}
		System.out.println("greater: "+grt);

		
		

	}

}
