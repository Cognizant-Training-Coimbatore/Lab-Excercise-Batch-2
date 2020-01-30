import java.util.Scanner;

public class Program54 {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.next();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			char a=s.charAt(i);
			System.out.print(a);
		}

	}

}
