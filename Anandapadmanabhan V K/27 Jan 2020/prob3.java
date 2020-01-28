import java.util.Scanner;

public class prob3 
	{
	static void validate(int length)throws NullPointerException
	{
	if(length==0)
		throw new NullPointerException("null");
	
	}
		
	public static void main(String[] args)
	{
		try
		{
		System.out.println("Enter the string");
		String str=new String();
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int length=str.length();	
		validate(length);
		System.out.println("The length is " + length);
		}
		catch(Exception m)
		{
		
			System.out.println("Exception occurred" + m);
		
		}
		
	}

}
