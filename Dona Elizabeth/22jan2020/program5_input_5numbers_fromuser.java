import java.util.Scanner;

public class program5_input_5numbers_fromuser {

	public static void main(String[] args) {
		int a,b,c,d,e;
		System.out.println("Enter 5 numbers");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		d=scanner.nextInt();
		e=scanner.nextInt();
		int sum=a+b+c+d+e;
		float avg=(a+b+c+d+e)/5;
		System.out.println("The sum of the 5 numbers is "+sum);
		System.out.println("The average of 5 numbers is "+avg);
	}

}
