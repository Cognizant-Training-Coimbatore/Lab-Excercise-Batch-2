import java.util.Scanner;
class operations
{
	int a,b,s;
	void addition(int x, int y)
	{
		a=x;
		b=y;
		s=a+b;
	}
	void adddisplay()
	{
		System.out.println("sum="+s);
	}
	void subtraction(int x,int y)
	{
		a=x;
		b=y;
		s=a-b;
		
	}
	void subdisplay()
	{
		System.out.println("Subtraction"+s);
	}
	void multiplication(int x,int y)
	{
		a=x;
		b=y;
		s=a*b;
	}
	void muldisplay()
	{
		System.out.println("Multiplication="+s);
	}
	void division(int x,int y)
	{
		a=x;
		b=y;
		s=a/b;
		
	}
	void divdisplay()
	{
		System.out.println("Division="+s);
	}
}
public class Q4_result_of_2num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		operations obj=new operations();
		System.out.println("Enter number 1: ");
		int c=sc.nextInt();
		System.out.println("Enter number 2: ");
		int d=sc.nextInt();
		obj.addition(c,d);
		obj.adddisplay();
		obj.subtraction(c,d);
		obj.subdisplay();
		obj.multiplication(c,d);
		obj.muldisplay();
		obj.division(c,d);
		obj.divdisplay();
		
		
	}

}
