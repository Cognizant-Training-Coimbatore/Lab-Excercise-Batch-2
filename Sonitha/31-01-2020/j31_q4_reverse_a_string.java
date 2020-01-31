import java.util.Scanner;

public class j31_q4_reverse_a_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		String s ="";
		int len = str.length();
		System.out.println(len);
		for(int i=len-1;i>=0;i--)
		{
			s = s+ str.charAt(i);
		}

		System.out.println("The reverse of the given string is :" + s);
	}

}

