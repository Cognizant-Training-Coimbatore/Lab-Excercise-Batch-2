import java.util.Scanner;
public class program9_string_length {
public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string..");
	String inputString = sc.nextLine();
	int len=inputString.length();
	System.out.println(len);
}
}
