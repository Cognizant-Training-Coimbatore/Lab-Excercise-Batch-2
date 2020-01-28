import java.util.Scanner;

public class program23_input_name {

	public static void main(String[] args) {
		String str;
		int len;
		System.out.println("Enter your name");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		len=str.length();
		System.out.println("The entered name is "+str.toUpperCase());
		System.out.println("The length of the entered name is "+len);
		
	}

}
