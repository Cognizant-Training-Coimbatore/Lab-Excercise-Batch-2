import java.util.Scanner;

public class program6_sum_avg 
{

	public static void main(String[] args) 
	{
		int sum=0,n=0,i;
		
		float avg;
		{
		
		System.out.println("Enter 5 numbers");
		}
		for (i=0;i<5;i++)
		{
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		sum=sum+n;
		}
		avg=sum/5;
		System.out.println("sum =" + sum + "\navg=" +avg);
		
		
		// TODO Auto-generated method stub

	}

}
