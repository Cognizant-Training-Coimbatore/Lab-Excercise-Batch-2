import java.util.Scanner;

public class practice8_sum_of_digits {

	public static void main(String[] args) 
	{
		int a=0;
		int i=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		while(a>0)
		{
			i=a%10;
			a=a/10;
			sum+=i;
		}
		System.out.println("The sum of digits is " +sum);
	}

}
