import java.util.Scanner;

public class prog73_array_sum_avg {

	public static void main(String[] args) 
	
	{ 
		int i,sum=0;
		float avg;
		int num[]=new int[5];
		Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
		System.out.println("Enter number "+i);
		num[i]=s.nextInt();
		sum=sum+num[i];
		}
		avg=sum/5;
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+avg);
		
		
		
	}

}
