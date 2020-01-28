import java.util.Scanner;

class operations
{
	int a,b;
	void addition()
	{
		int sum=a+b;
		System.out.println("Sum of two numbers is "+sum);
	}
	void sub()
	{
		int diff=a-b;
		System.out.println("Difference between two numbers is "+diff);
	}
	void multi()
	{
		int prod=a*b;
		System.out.println("Product of two numbers  is "+prod);
	}
	void divi()
	{
		int div=a/b;
		System.out.println("Quotient of two numbers  is "+div);
	}
}
public class program38_arithmetic {

	public static void main(String[] args) 
	{
		System.out.println("Enter two numbers");
		Scanner scanner = new Scanner(System.in);
		int n1=scanner.nextInt();
		int n2= scanner.nextInt();
		operations obj= new operations();
		obj.a=n1;
		obj.b=n2;
		obj.addition();
		obj.sub();
		obj.divi();
		obj.multi();
		
		

	}

}