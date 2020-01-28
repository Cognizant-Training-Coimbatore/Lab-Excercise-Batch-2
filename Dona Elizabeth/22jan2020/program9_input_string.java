//import java.lang.String;
import java.util.Scanner;

public class program9_input_string {

	public static void main(String[] args) {
		String str;
		int len;
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		len=str.length();
		System.out.println("The length of the entered string is "+len);
		
	}

}
