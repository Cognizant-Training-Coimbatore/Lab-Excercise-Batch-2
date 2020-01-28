import java.util.Scanner;

public class qu3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		System.out.println("enter 10 elements:");
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
		}
		int max = array[0];
		for(int i=1;i<array.length;i++)
		{
			if (array[i] > max)
			{
				max=array[i];
			}
		}
		System.out.println(max);
		
		
		
		int min = array[0];
		for(int i=1;i<array.length;i++)
		{
			if (array[i] < min)
			{
				min=array[i];
			}
		}
		System.out.println(min);
		
		
		int avg=0,sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		avg = sum/array.length;
		System.out.println(avg);
	}

}
