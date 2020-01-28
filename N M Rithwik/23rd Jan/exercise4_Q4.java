import java.util.Scanner;

class calculation
{
	void add(int a , int b)
	{
		int ans;
		ans = a+b;
		System.out.println("Addition : " + ans);
	}
	void sub(int a , int b)
	{
		int ans;
		ans = a-b;
		System.out.println("Subtraction : " + ans);
	}
	void multi(int a , int b)
	{
		int ans;
		ans = a*b;
		System.out.println("Multiplication : " + ans);
	}
	void div(int a , int b)
	{
		int ans;
		ans = a/b;
		System.out.println("Division : " + ans);
	}
}
public class exercise4_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation obj = new calculation();
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers : ");
		x=sc.nextInt();
		y=sc.nextInt();
		obj.add(x,y);
		obj.sub(x,y);
		obj.multi(x,y);
		obj.div(x,y);
	}

}
