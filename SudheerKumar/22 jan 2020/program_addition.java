import java.util.Scanner;

class operation
{
	int a;
	int b;
	operation(int x,int y)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=sc.nextInt();
		System.out.println("enter the value of b");
		b=sc.nextInt();
	}
	void sumofNumbers()
	{
		System.out.println(a+b);
	}
	void subofNumbers()
	{
		System.out.println(a-b);
	}
	void division()
	{
		System.out.println(a*b);
	}
	void multiply()
	{
		System.out.println(a/b);
	}
	
}
public class program_addition {

	public static void main(String[] args) {
		operation obj=new operation(2,3);
		obj.sumofNumbers();
		obj.subofNumbers();
		obj.division();
		obj.multiply();
		
		
		// TODO Auto-generated method stub

	}

}
