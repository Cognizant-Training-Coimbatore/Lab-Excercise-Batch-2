import java.util.Scanner;

public class practice5_string_length {

	public static void main(String[] args) {
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		name=sc.nextLine();
		int length=name.length();
		System.out.println("The length of the string is " +length);
	}

}
