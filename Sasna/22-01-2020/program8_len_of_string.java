import java.util.Scanner;

public class program8_len_of_string {

	public static void main(String[] args) {
		String name;
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		int length = name.length();
		System.out.println("length is:"+ length);
		
		

	}

}
