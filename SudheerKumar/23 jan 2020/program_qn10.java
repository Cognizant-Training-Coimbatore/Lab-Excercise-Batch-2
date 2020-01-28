import java.util.Scanner;
class g4
{
 String strg, r = "";
 void display() 
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a string:");
       strg = sc.nextLine();
  
       int length = strg.length();
  
       for ( int i = length - 1; i >= 0; i-- )
          r = r + strg.charAt(i);
  
       if (strg.equals(r))
          System.out.println(strg+" is a palindrome");
       else
          System.out.println(strg+" is not a palindrome");
 }
}
public class program_qn10 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  g4 obj=new g4();
  obj.display();
 }
}
  