import java.util.Scanner;

public class program5_sum_average {

	public static void main(String[] args) 
	{
		double i,n,sum=0,avg;
		for(i=0;i<5;i++)
		{
		System.out.println("enter the no.");
		Scanner scanner= new Scanner(System.in);
		n= scanner.nextInt();
		sum=sum+n;
		}
		avg=sum/5;
		System.out.println("Sum = "+sum+" and average = "+avg);
	}

}
