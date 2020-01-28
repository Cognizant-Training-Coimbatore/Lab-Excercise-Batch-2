import java.util.Scanner;

public class program12_sum_of_digits {

	public static void main(String[] args)
	{
		int num,l;
		System.out.println("enter your number");
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		int t,s=0;
		while(num>0)
		{
			t=num%10;
			s=s+t;
			num=num/10;
		}
		System.out.println("sum of digits are"+s);
		
	}

}
