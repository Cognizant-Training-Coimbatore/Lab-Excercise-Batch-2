import java.util.Scanner;

public class example8_sum 
	{

	public static void main(String[] args)
	{
		int a, b , sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		a = scanner.nextInt();
		while(a!=0)
		{
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println("The sum of the digit is: "+ sum);
	}

}
