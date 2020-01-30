import java.util.Scanner;

public class Program58 {

	public static void main(String[] args) {
		String s,r="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.next();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
			if(s.equals(r))
			{
			System.out.print("Palindrome");
			}
			else
			{
			System.out.print("Not Palindrome");
			}
		

	}

}

