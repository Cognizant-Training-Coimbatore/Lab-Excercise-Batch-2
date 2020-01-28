import java.util.Scanner;

class Calculator
{
	int a,b;
	int add(int a, int b)	
		{
		return a+b;
		}
	int sub(int a, int b)	
	{
	return a-b;
	}
	int mult(int a, int b)	
	{
	return a*b;
	}
	int div(int a, int b)	
	{
	return a/b;
	}
	int mod(int a, int b)	
	{
	return a%b;
	}
}
public class qstn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers--");
		int l=sc.nextInt();
		int b=sc.nextInt();
		Calculator obj=new Calculator();
		System.out.println("Addition\t:\t"+obj.add(l, b));
		System.out.println("Substraction\t:\t"+obj.sub(l, b));
		System.out.println("Multiplication\t:\t"+obj.mult(l, b));
		System.out.println("Division\t:\t"+obj.div(l, b));
		System.out.println("Modulous\t:\t"+obj.mod(l, b));
		sc.close();

	}

}
