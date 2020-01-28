import java.util.Scanner;

public class program12_sod {

	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit:");
		n=sc.nextInt();
		sum=n%10+(n/10)+(n/100);
		System.out.println("Sum of digits is :"+sum);
	}

}
