import java.util.Scanner;

public class program9_squre_of_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		System.out.println("Enter the value of a");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("Enter the value of b");
		b=scanner.nextInt();
		int sum=a+b;
		System.out.println("squre of two number is :" +sum*sum);
	}

}
