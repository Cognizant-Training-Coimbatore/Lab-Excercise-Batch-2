import java.util.*;   
public class program56_palindrome 
{  
   public static void main(String args[])  
   {  
      String org, reverse = "";  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter the input to check if it is a palindrome or not:");  
      org = in.nextLine();   
      int length = org.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + org.charAt(i);  
      if (org.equals(reverse))  
         System.out.println("Entered input is  palindrome.");  
      else  
         System.out.println("Entered input is not  palindrome.");   
   }  
}