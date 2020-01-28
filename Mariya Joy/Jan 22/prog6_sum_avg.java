import java.util.Scanner;

public class prog6_sum_avg
{

	public static void main(String[] args) {
		int i,sum=0,n=0;
		float avg;
		{
		System.out.println("Enter 5 numbers");
		}
		for(i=0;i<5;i++) 
		{
			Scanner scanner=new Scanner(System.in);
			n=scanner.nextInt();
			sum=sum+n;
		}
		
		avg=sum/5;
		System.out.println("The sum of numbers is "+sum+" and the average of numbers is "+avg);
		// TODO Auto-generated method stub

	}

}
