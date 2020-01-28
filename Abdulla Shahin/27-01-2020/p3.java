import java.util.Scanner;

public class p3 {

	static void validate(int length) throws NullPointerException
	{
		if (length == 0)
			throw new NullPointerException("not valid");
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		try
		{
			System.out.println("enter the string:");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			int length = str.length();
			validate(length);
			System.out.println("the length is " + length);
			
		}
		catch(Exception m)
		{
			System.out.println("exception occured " + m);
		}

	}

}
