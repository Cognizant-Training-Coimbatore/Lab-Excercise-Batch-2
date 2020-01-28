import java.util.Scanner;

public class Q7_program7_employee_code {
static void validate() throws myexceptions
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	if(n>=101 && n<=200)
	{
		System.out.println("valid");
	}
	else
	{
		throw new myexceptions("rejects");
	}
	
}
	public static void main(String[] args) {
		try
		{
			validate();
		}
		catch(Exception e)
		{
			System.out.println("Error occured"+e);
		}

	}

}
