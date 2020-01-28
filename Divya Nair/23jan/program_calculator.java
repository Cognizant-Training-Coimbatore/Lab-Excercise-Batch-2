import java.util.Scanner;

class calci
{
	
	void add(int a,int b)
	{
		
		System.out.println(a+b);
	}
	void subtract(int a,int b)
	{
		System.out.println(a-b);
		
		
	}
	void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
	void div(int a,int b){
		{
			System.out.println(a/b);	
		}
	}
	
	
	
}
public class program_calculator {

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=scan.nextInt();
		System.out.println("Enter second number:");
		int b=scan.nextInt();
		calci obj=new calci();
		obj.add(a,b);
		obj.subtract(a,b);
		obj.multiply(a,b);
		obj.div(a, b);
		
		
		

	}

}
