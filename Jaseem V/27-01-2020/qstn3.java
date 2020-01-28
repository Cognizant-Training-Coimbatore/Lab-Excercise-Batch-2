import java.util.Scanner;

public class qstn3
{
	static void validate(String s)throws NullPointerException
	{
		if(s.length()==0)
		{
			System.out.println("String cant be null");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String x =sc.nextLine();
		try
		{
			validate(x);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
