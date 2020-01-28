import java.util.Scanner;
public class program_set4_9q_sequential_search 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n,i,flag=0;
		System.out.println("Enter the size of the array:");
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the elements of the array:");
		
		
		for(i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
			
			
		}
		int key;
		System.out.println("Enter the key number to be searched:");
		Scanner scanner1 = new Scanner(System.in);
		key =scanner1.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i] == key)
			{
				System.out.println("element is present");
				break;
				
				
				
	
			}
			else if(a[i]!=key)
			{
				System.out.println("The element is not found");
				break;
			
			
			}
			
		}
		

	
	}
			
		

}


