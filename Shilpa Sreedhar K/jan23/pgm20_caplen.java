import java.util.Scanner;

public class pgm20_caplen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str;
	      int len;
	      Scanner scan = new Scanner(System.in);
		  System.out.print("Enter your name : ");
	      str = scan.nextLine();
	      len = str.length();
	      System.out.println(str.toUpperCase()); 
	      System.out.println("length is " +len);

	}

}