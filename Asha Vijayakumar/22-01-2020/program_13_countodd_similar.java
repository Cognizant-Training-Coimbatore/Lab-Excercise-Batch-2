import java.util.Scanner;

public class program_13_countodd_similar
{

	public static void main(String[] args)
	{
		
		int i,n,count=0;
		System.out.println("Enter array size");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int a[] = new int[n];
		
		
	
		System.out.println("Enter the elements of array");
		for(i=0;i<a.length;i++)
		{
			
			a[i]=scanner.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2 != 0)
			{
				count++;
				
			}
		}
		System.out.println("The count of odd numbers is " + count);
		
		
		// TODO Auto-generated method stub

	}

}
