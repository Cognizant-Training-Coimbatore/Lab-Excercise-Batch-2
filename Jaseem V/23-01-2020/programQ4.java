import java.util.Scanner;

class result
{
	int Add(int x,int y)
	{
		int A = (x+y);
		return A;
	}
	int Sub(int x,int y)
	{
		int S =x-y;
		return S;
	}
	int Mul(int x,int y)
	{
		int M=x*y;
				return M;
	}
	int Div(int x,int y)
	{
		int D=x/y;
		return D;
	}
}
public class programQ4 {

	public static void main(String[] args)
	{	result obj =new result();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int a =sc.nextInt();
		System.out.println("Enter another number");
		int b =sc.nextInt();
		System.out.println("Addition"+obj.Add(a,b));
		System.out.println("Substraction"+obj.Sub(a,b));
		System.out.println("Multiplication"+obj.Mul(a,b));
		System.out.println("Division"+obj.Div(a,b));
	}

}
