import java;
import java.util.Scanner;

public class program_6_sum_avg
{

	public static void main(String[] args)
	{
		int num,i,sum=0,avg;
		System.out.println("Enter the limit");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		for(i=0;i<num;i++)
		{
			System.out.println(+i);
			sum=sum+i;
			
			
		}
		avg=sum/num;
		System.out.println("The sum of numbers is" + sum);
		System.out.println("The average of numbers is" + avg);
		
		
		
		// TODO Auto-generated method stub

	}

}
