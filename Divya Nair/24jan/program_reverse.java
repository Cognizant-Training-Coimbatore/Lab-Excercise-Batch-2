import java.util.Scanner;

public class program_reverse {

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
	  }

	}


