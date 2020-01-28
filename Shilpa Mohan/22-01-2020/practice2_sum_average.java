import java.util.Scanner;

public class practice2_sum_average {

	public static void main(String[] args) {
		int a,b,c,d,e;
		int sum=0;
		int average;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		System.out.println("Enter the third number:");
		c=sc.nextInt();
		System.out.println("Enter the fourth number:");
		d=sc.nextInt();
		System.out.println("Enter the fifth number:");
		e=sc.nextInt();
		sum=a+b+c+d+e;
		average=sum/5;
		System.out.println("The sum is " +sum);
		System.out.println("The average is " +average);
	}

}
