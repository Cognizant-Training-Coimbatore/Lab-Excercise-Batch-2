import java.util.Scanner;

public class program24_String_upper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int l=s.length();
		String s_upper=s.toUpperCase();
		System.out.println("The length of the string  :"+l);
		System.out.println("Display in upper  :"+s_upper);
		
		
		

	}

}
