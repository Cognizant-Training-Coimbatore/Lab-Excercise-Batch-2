import java.util.Scanner;

class calc
{
	int c,d,e,f;
	void add(int a, int b)
	{
		c=a+b;
		System.out.println("Sum : "+c);
	}
	void sub(int a, int b)
	{
		d=a-b;
		System.out.println("Difference : "+d);
	}
	void mul(int a, int b)
	{
		e=a*b;
		System.out.println("Product : "+e);
	}
	void div(int a, int b)
	{
		f=a/b;
		System.out.println("quotient: "+f);
	}
}
public class pgm34_operations {

	public static void main(String[] args)
	{
		calc cl = new calc();
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter one number : ");
		num1=sc.nextInt();
		System.out.println("Enter another number : ");
		num2=sc.nextInt();
		cl.add(num1, num2);
		cl.sub(num1, num2);
		cl.mul(num1, num2);
		cl.div(num1, num2);
		sc.close();
	}

}
