import java.util.Scanner;

public class program22_String_to_Upper_case {
	public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name in small letters..");
	String inputString = sc.nextLine();
	String upperString = inputString.toUpperCase();
	System.out.println("Upper case sting is.."+upperString);
	count=inputString.length();
	System.out.println("Length..."+count);
	}}

