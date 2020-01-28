import java.util.Scanner;

class op
{
	void add(int a, int b)
	{
		System.out.println("Addition="+(a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("Subtraction="+(a-b));
	}
		void mult(int a,int b)
		{
			System.out.println("Multiplication="+ (a*b));

		}
		void div(int a, int b)
		{
			System.out.println("Division=" +(a/b));
		}
		
	}

public class a4_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		op ob=new op();
		System.out.println("Enter values");
		x=sc.nextInt();
		y=sc.nextInt();
		ob.add(x, y);
		ob.sub(x, y);
		ob.mult(x,y);
		ob.div(x,y);
		
		
		
		

	}

}
