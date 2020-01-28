import java.util.Scanner;

public class example12_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		str = sc.next();
		n = str.length();
		str = str.toUpperCase();
		System.out.println("Name in upper case: " + str);
		System.out.println("Length of string : " + n);
	}

}
