import java.util.Scanner;

public class program_formula {

	public static void main(String[] args) {
		int a;
		int b;
		int result;
		System.out.println("enter the value of a");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("enter the value of b");
		b=scanner.nextInt();
		result=(a * a)+(b * b)+(2 *a * b);
		System.out.println("the result is"+result);
		
		// TODO Auto-generated method stub

	}

}
