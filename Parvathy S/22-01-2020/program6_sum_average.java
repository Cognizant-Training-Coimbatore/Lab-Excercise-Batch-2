import java.util.Scanner;

public class program6_sum_average {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum,average;
		System.out.println("Enter the nos:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		sum = a+b+c+d+e;
		average = sum/5;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);

	}

}
