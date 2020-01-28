import java.util.Scanner;

public class pogram_palindrome {

	public static void main(String[] args)
	{
	String s, s1 = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to reverse");
    s = in.nextLine();

    int len = s.length();

    for (int i = len - 1 ; i >= 0 ; i--)
    {
      s1 = s1 + s.charAt(i);
    }
    System.out.println("Reverse of the string: " + s1);
    if(s.equals(s1))
    {
    	System.out.println("String is palindrome");

    }
    else
    {
    	System.out.println("String is not palindrome");
    }

}
}
