import java.util.Scanner;

public class prgm21_cap_length {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String str = sc.next();
		System.out.println(str.toUpperCase());
		int len = str.length();
		System.out.println("The length of the string is : "+ len );

	}

}
