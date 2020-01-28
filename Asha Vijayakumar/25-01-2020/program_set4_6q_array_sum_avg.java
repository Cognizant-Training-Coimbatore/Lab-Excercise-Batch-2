import java.util.Scanner;
public class program_set4_6q_array_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0,avg;
		System.out.println("Enter the array size:");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
			
		}
		for(i=0;i<a.length;i++)0
		{
			sum=sum+a[i];
		}
		System.out.println(+ sum);
		avg=sum/n;
		System.out.println(+ avg);
		
	}

}
