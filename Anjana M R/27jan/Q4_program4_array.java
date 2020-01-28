import java.util.Scanner;

public class Q4_program4_array {
	static void validate()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int n1=sc.nextInt();
	System.out.println("Enter the second number");
	int n2=sc.nextInt();
	int result=n1/n2;
	
		System.out.println("number1/number2:"+result);
	
	int a[]=new int[5];
	a[7]=result;
	System.out.println("access element 7"+a[7]);
	}

	public static void main(String[] args) {
try
{
	validate();
}
catch(ArithmeticException e)
{
	System.out.println("error"+e);
}
catch (ArrayIndexOutOfBoundsException e)
{
	System.out.println("error occured"+e);
}
finally
{
	System.out.println("correct");
}
	}

}
