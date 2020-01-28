import java.util.Scanner;

public class pgm24_string_length {

	public static void main(String[] args) {
		String str;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String st=str.toUpperCase();
		System.out.println("uppercase:" + st);
		int length=str.length();
		System.out.println("length of string is:" + length);
		

	}

}
