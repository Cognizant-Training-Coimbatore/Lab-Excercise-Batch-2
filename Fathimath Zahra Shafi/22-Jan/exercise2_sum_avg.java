import java.util.Scanner;

public class exercise2_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i,sum=0;
	double avg=0;
	
	Scanner scanner = new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("enter 5 numbers");
	for(i=0;i<5;i++)
	{
		a[i]=scanner.nextInt();
		sum=sum+a[i];
	}
	
	avg = sum/5;
	System.out.println("sum of 5 numbers: " +sum);
	System.out.println("average of 5 numbers: " +avg);
	
	
	
	
	
	}

}
