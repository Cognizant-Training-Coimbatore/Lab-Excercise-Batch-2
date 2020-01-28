import java.util.Scanner;

public class Custom_exception {

	public static void main(String[] args)
	{
		int emp_code;
		System.out.println("Enter the employee code:");
		Scanner in=new Scanner(System.in);
		emp_code=in.nextInt();
		
			if(emp_code>100 && emp_code<201)
			{
				System.out.println("Valid employee code");
				
			}
		
			else
		
			throw new ArithmeticException ("invalid employee code" );
		
		
		

	}

}
