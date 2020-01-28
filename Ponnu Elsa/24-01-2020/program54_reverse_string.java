
import java.util.*;
public class program54_reverse_string
{
  public static void main(String args[])
  {
    String org, reverse = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the string to be reversed");
    org = in.nextLine();

    int length = org.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + org.charAt(i);

    System.out.println("Reverse of the string is: " + reverse);
  }
}