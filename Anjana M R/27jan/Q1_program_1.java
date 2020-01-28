import java.util.Scanner;

public class Q1_program_1 {
	static void validate() throws myexceptions
	{
int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		if(n<=0)
		{
			throw new myexceptions("invalid");
		}
		else
		{
			System.out.println("valid");
		}
	}
	public static void main(String[] args) {
		try
		{
		 validate();
		}
		catch (Exception e)
		{
			System.out.println("Error occured"+e);
		}
	}

}
