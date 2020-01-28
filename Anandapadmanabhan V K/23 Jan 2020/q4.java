import java.util.Scanner;

class arithmetic0
{
	int ans;
	void add(int x,int y)
	{
		ans=x+y;
	}
	void sub(int x,int y)
	{
		ans=x-y;
	}
	void mul(int x,int y)
	{
		ans=x*y;
	}
	void div(int x,int y)
	{
		ans=x/y;
	}
	void display()
	{
		System.out.println(ans);
	}
}
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		arithmetic0 obj=new arithmetic0();
		obj.add(a,b);
		obj.display();
		obj.sub(a, b);
		obj.display();
		obj.mul(a,b);
		obj.display();
		obj.div(a, b);
		obj.display();
	}

}
