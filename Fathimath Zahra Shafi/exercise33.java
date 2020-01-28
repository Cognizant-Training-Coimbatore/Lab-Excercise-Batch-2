import java.util.Scanner;

public class exercise33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		String rev="";
		System.out.println("enter a string");
		Scanner scanner=new Scanner(System.in);
		str=scanner.nextLine();
		int n=str.length();
		
		
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		if(rev.equals(str))
			System.out.println("string is a palindrome");
		else
			System.out.println("string is not a palindrome");

	}

}
