import java.util.Scanner;

public class program6_sum_avg {

	public static void main(String[] args) {
		int a,b,c,d,e,s;
		double avg;
		System.out.println("Enter the value for a");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("Enter the value for b");
		b = scanner.nextInt();
		System.out.println("Enter the value for c");
		c = scanner.nextInt();
		System.out.println("Enter the value for d");
		d = scanner.nextInt();
		System.out.println("Enter the value for e");
		e= scanner.nextInt();
		s=a+b+c+d+e;
		avg=s/5;
		System.out.println("The sum is " +s);
		System.out.println("The average is " +avg);
		
	}

}
