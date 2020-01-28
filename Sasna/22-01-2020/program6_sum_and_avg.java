import java.util.Scanner;

public class program6_sum_and_avg {

	public static void main(String[] args) {
		int sum = 0, average=0;
		int num1,num2,num3,num4,num5;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value for num1");
		num1 = scanner.nextInt();
		System.out.println("enter value for num2");
		num2 = scanner.nextInt();
		System.out.println("enter value for num3");
		num3 = scanner.nextInt();
		System.out.println("enter value for num4");
		num4 = scanner.nextInt();
		System.out.println("enter value for num5");
		num5 = scanner.nextInt();
		sum = num1+num2+num3+num4+num5;
		average = sum/5;
		System.out.println(sum);
		System.out.println(average);
	}

}
