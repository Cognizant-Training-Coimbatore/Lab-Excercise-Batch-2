import java.util.Scanner;

public class pgm_sum_avg {

	public static void main(String[] args) 
	{
		int number,ip=0,sum=0,total=0;
		double avg=0;
		System.out.println("enter the total numbers: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for(int i=1;i<=number;i++)
		{
			ip = scanner.nextInt();
			sum=sum+ip;
		}
		avg=sum/number;
		System.out.println(sum);
		System.out.println(avg);

	}

}
