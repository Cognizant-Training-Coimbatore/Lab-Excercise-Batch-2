import java.util.Scanner;

public class qu10 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = sc.nextLine();
		String str = str1;
		String rev = "";
		int length = str.length();
		for(length=length-1;length>=0;length--)
		{
			rev=rev + str.charAt(length);
		}
		if( str1.equals(rev) )
		{
			System.out.println("its pallindrome");
		}
		else
		{
			System.out.println("its not a pallindrome");
		}

	}

}
