import java.util.Scanner;

class string_handler
{
	void lowercase(String str)
	{
		System.out.println("The string is"+str.toLowerCase());
	}
	void length(String str)
	{
		System.out.println("The length of string is "+str.length());
	}
}
public class programQ5 {

	public static void main(String[] args)
	{
		Scanner cd =new Scanner(System.in);
		System.out.println("Your Name :");
		String str = cd.nextLine();
		string_handler obj = new string_handler();
		obj.lowercase(str);
		obj.length(str);
		
		

	}

}
