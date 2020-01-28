import java.util.Scanner;

public class pgm9_strlength {

	public static void main(String[] args) {
		String str;
		int len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		str = sc.nextLine();
		len = str.length();
		System.out.println("string length :"+ len);
	}

}
