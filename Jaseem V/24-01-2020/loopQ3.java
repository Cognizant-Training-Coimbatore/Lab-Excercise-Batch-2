import java.util.Scanner;

public class loopQ3 
{

	public static void main(String[] args) 
	{Scanner sc =new Scanner(System.in);
	int ar[];
	ar=new int[20];
	for(int i=0;i<10;i++)
	{
		System.out.println("Enter number :");
		ar[i] =sc.nextInt();
	}
		int large =ar[0];
		for(int i=1;i<10;i++)
		{
			if(ar[i]>large)
			{
				large=ar[i];
			}
		}
		System.out.println("Largest :"+large);
		int small =ar[0];
		for(int i=1;i<10;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
	System.out.println("Smallest :"+small);
	int avg;
	int sum = ar[0]+ar[1]+ar[2]+ar[3]+ar[4]+ar[5]+ar[6]+ar[7]+ar[8]+ar[9];
	
	
		
		avg= sum/10;
	
	
	System.out.println("Average :"+avg);
	
	
	
	
	}

}
