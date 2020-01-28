import java.util.Scanner;

class operation
{
	
	int a,b, result=0;
	
	int add(int a, int b)
	{
		result = a+b;
		return result;
	}
	
	int sub(int a, int b)
	{
		result = a-b;
		return result;
	}
	int mul(int a, int b)
	{
		result = a*b;
		return result;
	}
	
	int div(int a, int b)
	{
		result = a/b;
		return result;
	}
	
	
}


public class exercise17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,a,s,m, d;
		System.out.println("enter 2 numbers");
		Scanner scanner= new Scanner(System.in);
		x=scanner.nextInt();
		y=scanner.nextInt();
		operation obj=new operation();
		a=obj.add(x, y);
		s=obj.sub(x, y);
		m=obj.mul(x, y);
		d=obj.div(x, y);
		System.out.println("sum of numbers : " +a);
		System.out.println("difference of numbers : " +s);
		System.out.println("product of numbers : " +m);
		System.out.println("division of numbers : " +d);

	}

}
