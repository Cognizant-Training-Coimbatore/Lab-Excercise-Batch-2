import java.util.Scanner;

public class loopQ10 {
	public String reverseString(String str){
	   
    if(str.isEmpty()){
       return str;
    } else {
       return reverseString(str.substring(1))+str.charAt(0);
    }
 }
 public static void main(String[] args) {
    loopQ10 obj = new loopQ10();
	System.out.println("Enter the string");
 	Scanner scanner = new Scanner(System. in); 
      String inputString = scanner. nextLine(); 
    String result = obj.reverseString(inputString);
    System.out.println(result);
if(result.equals(inputString))
{
System.out.println("Palindrome");

}else
{{
	System.out.println("Not Palindrome");

	}
	}

 }

}