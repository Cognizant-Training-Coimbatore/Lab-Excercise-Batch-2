import java.util.Scanner;

public class pgm5_sumavg {

	public static void main(String[] args) {
		int sum,avg,i;
		sum=0;
		avg=0;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 nos  :");
		for(i=1;i<=5;i++)
		{
		num=sc.nextInt();
			sum=sum+num;
			avg = sum / i;
		}
		System.out.println("Sum of 5 nos  :"+ sum+"\n");
		System.out.println("Average of 5 nos  :"+avg);
	}

}
