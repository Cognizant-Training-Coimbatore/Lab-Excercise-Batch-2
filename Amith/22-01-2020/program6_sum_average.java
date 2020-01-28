import java.util.Scanner;

public class program6_sum_average 
{

	public static void main(String[] args)
	{
		int a,b,c,d,e;
		int sum;
		float avg;
		System.out.println("enter the first numbers");
		Scanner scanner = new Scanner(System.in);
		a= scanner.nextInt();
		System.out.println("enter the second numbers");
		b=scanner.nextInt();
		System.out.println("enter the third numbers");
		c=scanner.nextInt();
		System.out.println("enter the fourth numbers");
		d=scanner.nextInt();
		System.out.println("enter the fifth numbers");
		e=scanner.nextInt();
		sum=a+b+c+d+e;
		avg=sum/5;
		System.out.println("sum is"+sum+"and average is"+avg);
		
	}

}
