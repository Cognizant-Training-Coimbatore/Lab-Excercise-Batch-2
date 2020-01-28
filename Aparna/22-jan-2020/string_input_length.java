import java.util.Scanner;

public class string_input_length {

	public static void main(String[] args) {
		System.out.println("Enter the string");
	
		Scanner scanner=new Scanner(System.in);
	    String inputString = scanner.nextLine();
	    int Length = inputString.length();
	    System.out.println("string length is" +Length);


	}

}
