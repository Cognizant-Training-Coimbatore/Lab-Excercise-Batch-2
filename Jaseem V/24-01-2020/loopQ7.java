import java.io.*;
import java.util.Scanner;

public class loopQn7 {
	public String reverseString(String str){
		   
	      if(str.isEmpty()){
	         return str;
	      } else {
	         return reverseString(str.substring(1))+str.charAt(0);
	      }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopQn7 obj = new loopQn7();
		System.out.println("Enter the string");
	   	Scanner scanner = new Scanner(System. in); 
	        String inputString = scanner. nextLine(); 
	      String result = obj.reverseString(inputString);
	      System.out.println(result);
	}

}