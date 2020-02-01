import java.util.Scanner;

public class program_lstset_2q_resultdivide {

	public static void main(String[] args) 
	{
		int a,b,result;
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("Enter another number:");
		Scanner scanner1 = new Scanner(System.in);
		b = scanner1.nextInt();
		result = a/b;
		System.out.println(+ result);
		
		if (b==0)
		{
			throw new ArithmeticException("check the operands");
		}
			
		
		
		// TODO Auto-generated method stub

	}

}
