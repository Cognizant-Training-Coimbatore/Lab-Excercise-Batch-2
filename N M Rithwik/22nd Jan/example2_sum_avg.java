import java.util.Scanner;

public class example2_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b,c,d,e,f,sum,avg;
		System.out.println("Enter 5 numbers");
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		sum=b+c+d+e+f;
		avg=sum/5;
		System.out.println("Sum = " + sum + " Average = " + avg);
	}

}
