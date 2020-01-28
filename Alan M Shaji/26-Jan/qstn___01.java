import java.util.Scanner;

public class qstn___01 {

	static void validate(int a) throws qstn___01PositiveException
	{
		if (a<0)
			throw new qstn___01PositiveException("Enter positive number");
		else
			System.out.println("Positive number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a number");
			int a=sc.nextInt();
			validate(a);
		}
		catch(Exception m)
		{
			System.out.println("exception occured : "+m);
		}
		

	}

}
