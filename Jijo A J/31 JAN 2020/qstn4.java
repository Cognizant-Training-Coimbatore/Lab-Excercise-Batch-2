import java.io.*;
import java.util.Scanner;


public class qstn4 {
   public String reverseString(String str){
   
      if(str.isEmpty()){
         return str;
      } else {
         return reverseString(str.substring(1))+str.charAt(0);
      }
   }
   public static void main(String[] args) {
      qstn4 obj = new qstn4();
	System.out.println("Enter the string");
   	Scanner scanner = new Scanner(System. in); 
        String inputString = scanner. nextLine(); 
      String result = obj.reverseString(inputString);
      System.out.println(result);
   }
}