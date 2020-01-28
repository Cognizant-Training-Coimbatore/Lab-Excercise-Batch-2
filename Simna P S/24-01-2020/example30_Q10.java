import java.util.Scanner;

public class example30_Q10 
{

	public static void main(String[] args) 
	{
		int l; 
		String rev="";
		Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();
        l=str.length();
        for(int i=l-1;i>=0;i--)
  		  rev=rev+str.charAt(i);
        if(str.equals(rev))
        {
        	System.out.println("The entered string is a palindrome");
        }
        else
        {
        	System.out.println("The entered string is not a palindrome");
        }

	}

}
