import java.util.Scanner;

public class pgm54_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str;
		  char ch;
		  int count = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	      str=str.toLowerCase();
	      int length = str.length();
	      for ( int i = length - 1; i >= 0; i-- )
	      {
	    	  ch = str.charAt(i);
	    	  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	          {
	        	 count++;
	          }
	      }
	      System.out.println("No. of vowels : "+count);
	}

}
