import java.util.Scanner;

public class pgm52_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	      int length = str.length();
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i); 
	      System.out.println("Reverse of the  string: "+rev);
	}

}
