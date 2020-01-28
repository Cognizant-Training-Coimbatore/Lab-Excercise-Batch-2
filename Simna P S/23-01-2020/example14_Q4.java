import java.util.Scanner;

class maths
{
	void add(int a, int b)
	{
		int addd;
		addd= a+b;
		System.out.println("Sum= "+addd);
	}
	void sub(int a, int b)
	{
		int subb;
		subb=a-b;
		System.out.println("Difference= "+subb);
	}
	void mult(int a, int b)
	{
		int multi;
		multi= a*b;
		System.out.println("Product= "+multi);
	}
	void div(int a, int b)
	{
		int divv;
		divv= a/b;
		System.out.println("Division= "+divv);
	}
}
public class example14_Q4 
{

	public static void main(String[] args) 
	{
		maths obj = new maths();
		int x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		x = scanner.nextInt();
		System.out.println("Enter the second nuber: ");
		y = scanner.nextInt();
		obj.add(x, y);
		obj.sub(x, y);
		obj.mult(x, y);
		obj.div(x, y);
	}

}
