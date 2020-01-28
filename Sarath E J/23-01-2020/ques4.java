import java.util.Scanner;

class arith
{
	int a,b;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		
	}
	void add()
	{
		int c=a+b;
		System.out.println("addition= "+c);
	}
	void multiply()
	{
		int c=a*b;
		System.out.println("multi= "+c);
	}
	void sub()
	{
		int c=a-b;
		System.out.println("sub= "+c);
	}
}

public class multi32 {

	public static void main(String[] args) 
	{
		arith ob = new arith();
		System.out.println("Enter two numbers:");
		ob.input();
		ob.add();
		ob.multiply();
		ob.sub();

	}

}
