import java.util.Scanner;

public class p3_sum_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int d = sc.nextInt();
		int sum = 0;
		for(;d>0;d/=10)
		{
			
		 sum = sum + d%10;
		}
	
		System.out.println("The sum of the digits is :" + sum);
	}

}
