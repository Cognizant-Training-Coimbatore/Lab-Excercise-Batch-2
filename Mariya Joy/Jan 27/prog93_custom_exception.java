import java.util.Scanner;

public class prog93_custom_exception
{
	static void checkemp(int num)
	{
		if (num>=101 && num<=200)
		{
			System.out.println("Employee id is valid");
		}
		else
		{
			throw new ArithmeticException("Invalid employee id");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int emp_id;
		System.out.println("Enter your emp id: ");
		emp_id=sc.nextInt();
		checkemp(emp_id);
		sc.close();
		}

}
