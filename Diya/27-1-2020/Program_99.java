import java.util.Scanner;

public class Program_99 {
	static void validate(String s)throws NullPointerException
	{
		if(s.length()==0)
		{
			System.out.println("String cant be null");
		}	
	}
	public static void main(String[] args) {
		String s;
		System.out.println("Enter the String");
		Scanner sc =new Scanner(System.in);
		s=sc.nextLine();
		try
		{  
			validate(s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}