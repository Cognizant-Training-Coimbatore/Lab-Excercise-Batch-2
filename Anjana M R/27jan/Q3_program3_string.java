import java.util.Scanner;

public class Q3_program3_string {
static void validate() throws myexceptions
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine();
	int l=s.length();
	if(l!=0)
	{
		System.out.println("String "+s);
	}
	else
	{
		throw new NullPointerException("NULL");
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
