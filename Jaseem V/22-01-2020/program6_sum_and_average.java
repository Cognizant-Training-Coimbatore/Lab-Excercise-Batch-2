import java.util.Scanner;

public class program6_sum_and_average {

	public static void main(String[] args)
	{ int a,b,c,d,e,sum;
	 double avg;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("The first number:");
		 a = sc.nextInt();
		System.out.println("The second number:");
		b= sc.nextInt();
		System.out.println("The third number:");
		c= sc.nextInt();
		System.out.println("The fourth number:");
		d= sc.nextInt();
		System.out.println("The fifth number:");
		e = sc.nextInt();
		 sum= a+b+c+d+e;
		  avg = sum/5;	
		  System.out.println("Sum is :"+sum+ "\n The average is :" +avg);
	}

}
