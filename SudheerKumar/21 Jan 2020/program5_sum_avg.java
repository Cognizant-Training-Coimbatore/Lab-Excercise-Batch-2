import java.util.Scanner;

public class program5_sum_avg {

	public static void main(String[] args) {
		int result;
		int a;
		int b;
		int avg;
		int c;
		int d;
		int e;
		System.out.println("enter the value of a");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("enter the value of b");
		
		b=scanner.nextInt();
		System.out.println("enter the value of c ");
		
		c=scanner.nextInt();
		System.out.println("enter the value of d");
		
		d=scanner.nextInt();
		System.out.println("enter the  value of e");
		
		e=scanner.nextInt();
		result=a+b+c+d+e;
		System.out.println("the result is "+result);
	
		
		
		 avg = result/5;
		 System.out.println("the average is "+avg);
		
	}
		
		// TODO Auto-generated method stub

	}


