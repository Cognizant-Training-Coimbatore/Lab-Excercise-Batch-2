import java.util.Scanner;

public class Q4_reverse_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.nextLine();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse = "+rev);
	}

}
