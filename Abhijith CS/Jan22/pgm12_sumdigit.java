import java.util.Scanner;

public class pgm12_sumdigit {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k;
		int sum=0;
		while(num>0)
		{
			k=num%10;
			sum = sum+k;
			num=num/10;
		}
		System.out.println("Sum of digits :"+sum);
		sc.close();
	}

}
