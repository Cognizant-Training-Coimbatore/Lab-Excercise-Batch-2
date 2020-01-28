import java.util.Scanner;

public class prog6_sum {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum,avg;
		int a,b,c,d,e;
		System.out.println("Enter fst number:  ");
		a=sc.nextInt();
		System.out.println("Enter 2nd number:  ");
		b=sc.nextInt();
		System.out.println("Enter 3rd number:  ");
		c=sc.nextInt();
		System.out.println("Enter 4th number:  ");
		d=sc.nextInt();
		System.out.println("Enter 5th number:  ");
		e=sc.nextInt();
		sum=a+b+c+d+e;
		avg=sum/5;
		System.out.println("The sum is :   "+sum);
		System.out.println("The avg is:  "+avg);
		
		
	}

}
