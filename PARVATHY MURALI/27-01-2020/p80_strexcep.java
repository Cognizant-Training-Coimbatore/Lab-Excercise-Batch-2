import java.util.Scanner;

public class p80_strexcep 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the string:");
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		int l=n.length();
		
		if(l==0)
		{
			throw new NullPointerException("Null string..........");
		}
		
		else
		{
			System.out.println("No of character: "+l);
		}
		
		
	}

}
