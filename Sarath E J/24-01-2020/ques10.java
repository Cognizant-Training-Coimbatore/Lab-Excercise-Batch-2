import java.util.Scanner;

public class prog44 {

	public static void main(String[] args) 
	{

		String str,rev="";
		Scanner sc = new Scanner(System.in);
		
		str = sc.next();
		for(int i=(str.length()-1);i>=0;i--)
		{
			rev=rev+str.charAt(i);
		
		}
		if(str.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("sorry");
		}


	}

}
