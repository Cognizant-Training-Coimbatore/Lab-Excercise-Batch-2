import java.util.Scanner;

public class Myclass_Exception 
{
	static void checkage(int age) throws ArithmeticException
	{
		
		if(age<18)
		{
			throw new ArithmeticException("Cannot vote");
		}
		else
		{
			System.out.println("Can vote...");
		}
			
	}

	public static void main(String[] args)
	{
		checkage(45);
		checkage(17);

	}

}
