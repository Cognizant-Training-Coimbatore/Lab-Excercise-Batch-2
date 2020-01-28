import java.util.Scanner;

public class Invalid_marks_exception {

	public static void main(String[] args)
	{
		int marks;
		System.out.println("Enter the marks:");
		Scanner in=new Scanner(System.in);
		marks=in.nextInt();
		if(marks>0)
		{
			System.out.println("Valid marks..");
			
		}
		else 
			throw new ArithmeticException("Invalid marks entered...");

	}

}
