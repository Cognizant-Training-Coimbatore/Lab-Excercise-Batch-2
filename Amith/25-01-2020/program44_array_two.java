import java.util.Scanner;

public class program44_array_two {

	public static void main(String[] args) 
	{
		int n,i,great;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		n=sc.nextInt();
		System.out.println("enter the numbers");
		int array[]= new int[n];
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		great=0;
		for (i=0;i<n;i++)
		{
			if(array[i]>great)
			{
				great=array[i];
			}
		}
		System.out.println("greatest number is "+great );
		
		
	}

}
