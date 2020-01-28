import java.util.Scanner;

class operators
{
	
	void add(int x,int y)
	{
		int sum=x+y;
		System.out.println(sum);
	}
	void sub(int x,int y)
	{
		int subt=x-y;
		System.out.println(subt);
	}
	void mul(int x,int y)
	{
		int res=x*y;
		System.out.println(res);
	}
	void div(int x,int y)
	{
		int resl=x/y;
		System.out.println(resl);
	}
	
}
public class programq4_operations {

	public static void main(String[] args)
	{
		System.out.println("Enter the number1");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the number2");
		int b=sc.nextInt();
		operators obj=new operators();
		obj.add(a, b);
		obj.sub(a, b);
		obj.mul(a, b);
		obj.div(a,b);
		

	}

}
