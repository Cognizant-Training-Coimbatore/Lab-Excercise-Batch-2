import java.util.Scanner;

public class str_cap_length {

	public static void main(String[] args) {
		String str;
		int n=0;
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		String newstr= str.toUpperCase();
		System.out.println(newstr);
		int length=str.length();
		System.out.println("Length is " + length);
	}

}
