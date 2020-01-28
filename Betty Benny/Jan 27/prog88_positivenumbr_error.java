import java.util.Scanner;

public class prog88_positivenumbr_error {

	public static void main(String[] args)
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
		{
		System.out.println("positive");
		}

		else
		{
		throw new ArithmeticException("invalid number...please enter positive number");

		}

		}
}

		


		// TODO Auto-generated method stub

	
