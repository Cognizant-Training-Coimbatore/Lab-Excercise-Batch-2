import java.util.Scanner;

public class prog_palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		int i,len;
		String rev="";
		len = str.length();
		for(i=len-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
        if(str.equals(rev))
        {
        	System.out.println("String is a palindrome");
        }
        else
        {
        	System.out.println("String is not a palindome");
        }
	}

}
