import java.util.Scanner;

public class lab7 {
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
		Scanner sc = new Scanner(System.in);
		int emp_id;
		System.out.println("Enter your emp id: ");
		emp_id=sc.nextInt();
		checkemp(emp_id);
		sc.close();
		}
		
	}


