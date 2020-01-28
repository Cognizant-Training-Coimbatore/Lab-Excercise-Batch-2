import java.util.Scanner;

class arithmetic
{
	int res;
	void add(int x,int y )
	{
		res=x+y;
	}
	void sub(int x,int y )
	{
		res=x-y;
	}
	void mul(int x,int y )
	{
		res=x*y;
	}
	void div(int x,int y )
	{
		res=x/y;
	}
	void display()
	{
		System.out.println(res);
	}
}
public class q4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no,:");
		int a=sc.nextInt();
		System.out.println("enter second no,:");
		int b=sc.nextInt();
		arithmetic obj = new arithmetic();
		obj.add(a, b);
		obj.display();
		obj.sub(a, b);
		obj.display();
		obj.mul(a, b);
		obj.display();
		obj.div(a, b);
		obj.display();
	}

}
