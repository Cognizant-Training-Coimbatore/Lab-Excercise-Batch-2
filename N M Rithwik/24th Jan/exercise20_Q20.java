import java.util.Scanner;

public class exercise20_Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,reverse="";
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.next();
		n = str.length();
		n--;
		while(n>=0)
		{
			reverse = reverse + str.charAt(n);
			n--;
		}
		System.out.println("the reverse of string is : " + reverse);
		if(str.contentEquals(reverse))
		{
			System.out.println("The string is palindrome.");
		}
		else
		{
			System.out.println("The string is not palindrome");
		}
	}

}
