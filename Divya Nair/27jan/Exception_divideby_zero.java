import java.util.Scanner;

public class Exception_divideby_zero {

	public static void main(String[] args)
	{
		int num1,num2,result;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a dividend:");
		num1=in.nextInt();
		System.out.println("Enter a divisor:");
		num2=in.nextInt();
		result=num1/num2;
		if(num2>0)
		{
			System.out.println("Result is:"+result);
		}
		else if(num2==0)
			throw new ArithmeticException("Divide by zero Error...");
		
		

	}

}
