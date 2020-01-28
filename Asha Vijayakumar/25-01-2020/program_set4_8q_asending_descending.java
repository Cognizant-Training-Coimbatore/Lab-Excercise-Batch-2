import java.util.Scanner;
public class program_set4_8q_asending_descending
{

	public static void main(String[] args) 
	{
		int n,i,j,temp;
		System.out.println("Enter the size of the array:");
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
			
			
		}
		//sort array in ascending order
		System.out.println("sort the array in ascending order:");
		for(i=0;i<a.length;i++)
			
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println( + a[i]);
			
		}
		//sort array in descending order
		System.out.println("The sorted array in descending order:");
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
