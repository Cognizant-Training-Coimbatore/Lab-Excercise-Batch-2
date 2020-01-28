import java.util.Scanner;

class operation
{
	int a,b;
	void accept()
	{
		System.out.println("Enter the number for a");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("Enter the number for b");
		b = scanner.nextInt();
		
	}
	void addition()
	{
		System.out.println("Sum of two numbers is:" + (a+b));
	}
	void substraction()
	{
		System.out.println("Difference of two numbers is:" + (a-b));
	}
	void multiplication()
	{
		System.out.println("Product of two numbers is:" + (a*b));
	}
	void division()
	{
		System.out.println("Divide two numbers gives:" + (a/b));
	}
	
	
}
public class program45_arithmetic {

	public static void main(String[] args) {
		operation obj = new operation();
		obj.accept();
		obj.addition();
		obj.substraction();
		obj.multiplication();
		obj.division();
		// TODO Auto-generated method stub

	}

}
