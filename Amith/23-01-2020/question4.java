import java.util.Scanner;

class operations
{
	int a,b;
	void addition()
	{
		int sum=a+b;
		System.out.println("sum is"+sum);
	}
	void sub()
	{
		int diff=a-b;
		System.out.println("difference is"+diff);
	}
	void multi()
	{
		int prod=a*b;
		System.out.println("product is"+prod);
	}
	void divi()
	{
		int div=a/b;
		System.out.println("result is"+div);
	}
}
public class question4 {

	public static void main(String[] args) 
	{
		System.out.println("enter twonumbers");
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
