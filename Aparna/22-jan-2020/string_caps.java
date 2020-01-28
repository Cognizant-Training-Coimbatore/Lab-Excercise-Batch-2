import java.util.Scanner;

public class string_caps {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner scanner=new Scanner(System.in);
	    String inputString = scanner.nextLine();
	    String upperString = inputString.toUpperCase();
	    System.out.println("upper string is " +upperString);
	    int Length = inputString.length();
	    System.out.println("length " +Length);
	    
	    

	}

}
