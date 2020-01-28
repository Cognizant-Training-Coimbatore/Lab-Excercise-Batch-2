import java.util.Scanner;

public class pgm8_strlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str;
	      int len;
	      Scanner scan = new Scanner(System.in);
		  
	      System.out.print("Enter a string : ");
	      str = scan.nextLine();
	      len = str.length();
		  
	      System.out.print("Length of Entered String is " + len);
	}

}
