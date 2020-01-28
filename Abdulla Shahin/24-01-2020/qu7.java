import java.util.Scanner;

public class qu7 {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		String rev = "";
		int length = str.length();
		for(length=length-1;length>=0;length--)
		{
			rev=rev + str.charAt(length);
		}
		System.out.println(rev);

	}

}
