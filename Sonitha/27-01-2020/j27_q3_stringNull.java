import java.util.Scanner;

public class j27_q3_stringNull {

	public static void main(String[] args) {
		//String str;
		String s = null;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a string");
		//str = sc.next();
		//int len = str.length();
		
		try {
			int len1 = s.length();
			System.out.println("the number of characters in the given string : "+len1);
			
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("The string is null");
			System.out.println("Exception : "+ e );
		}
		

	}

}
