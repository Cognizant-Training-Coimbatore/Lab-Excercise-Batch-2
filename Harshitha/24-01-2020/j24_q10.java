import java.util.Scanner;

public class j24_q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		int len = str.length();
		String rev ="";
		for (int i= len-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
			}
		if(rev.equalsIgnoreCase(str) ){
         System.out.println("The given string is a palindrome");
		}else {
			System.out.println("The given string is not a palindrome");
		}
	}

}
