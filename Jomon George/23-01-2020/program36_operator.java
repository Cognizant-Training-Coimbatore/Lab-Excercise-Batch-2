import java.util.Scanner;

class operator
{
	int x,y;
	void add(int a, int b)
	{
		System.out.println("addition result:"+(a+b));
	}
	void sub(int a, int b)
	{
		System.out.println("subtraction result:"+(a-b));
	}
	void mul(int a, int b)
	{
		System.out.println("multiplication result:"+(a*b));
	}
	void div(int a, int b)
	{
		System.out.println("division result:"+(a/b));
	}
}
public class program36_operator 
{
	
	
	
		
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first operand=");
			int p1=sc.nextInt();
			System.out.println("Enter second operand=");
			int p2=sc.nextInt();
			operator ob=new operator();
			ob.add(p1,p2);
			ob.sub(p1,p2);
			ob.mul(p1,p2);
			ob.div(p1,p2);

		}
		
		

}
