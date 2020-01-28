import java.util.Scanner;

public class program9_string_length
{
   public static void main(String args[])
   {
      String str;
      int len;
      Scanner s = new Scanner(System.in);
	  
      System.out.print("Enter Your String : ");
      str = s.nextLine();
      len = str.length();
	  
      System.out.print("Length of Entered String is: " + len);
   }
}
