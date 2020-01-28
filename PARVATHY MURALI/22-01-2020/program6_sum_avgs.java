import java.util.Scanner;

public class program6_sum_avgs
{

	public static void main(String[] args) 
	{
		float sum=0;
		System.out.println("Enter 5 numbers:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			int number=sc.nextInt();
			sum=sum+number;
		}
		System.out.println("Sum of 5 numbers: "+sum);
		System.out.println("Average of 5 numbers:"+(sum/5));

	}

}
