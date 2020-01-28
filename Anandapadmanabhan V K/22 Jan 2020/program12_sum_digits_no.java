import java.util.Scanner;

public class program12_sum_digits_no {

	public static void main(String[] args) {
		int a,rem=0,ans=0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for(int i=0;i<=a;i++)
		{
			rem=a%10;
			ans=ans+rem;
			a=a/10;
		}
		System.out.println("The sum of digits is " + ans);
	}

}
