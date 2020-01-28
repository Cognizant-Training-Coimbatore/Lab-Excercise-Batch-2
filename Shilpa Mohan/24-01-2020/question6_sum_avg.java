import java.util.Scanner;
public class question6_sum_avg {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a=0;
		int sum=0;
		int avg=0;
		int b=0;
	    System.out.println("Enter the numbers:");
		do
		{
			a=sc.nextInt();
			sum=sum+a;
			b=b+1;
			
		}while(a!=-999);
		avg=sum/b;
		System.out.println("The sum of the numbers is " +sum);
		System.out.println("The average of the numbers is " +avg);
			}
	}
