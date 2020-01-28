import java.util.Scanner;

public class pgm58_pallindrome_string {

	public static void main(String[] args) {
System.out.println("Enter string :");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
if(str.equals(reverse))
{

        
     
   System.out.println(str + " is pallindrome");
}
else
{
        System.out.println(str + " is not pallindrome");
    }
}


	}


