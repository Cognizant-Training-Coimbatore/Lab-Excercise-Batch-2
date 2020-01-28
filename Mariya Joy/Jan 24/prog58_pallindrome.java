import java.util.Scanner;

public class prog58_pallindrome {

	public static void main(String[] args) {
		String str,rev="";
		int l;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		str=s.nextLine();
		l=str.length();
		for(int i=l-1;i>=0;i--)
		
			rev=rev+str.charAt(i);
		System.out.println(rev);
		if(str.equals(rev))
		
		{
			System.out.println("pallindrome");
		}
		
		else
		{
			System.out.println("not pallindrome");
		}
		
		
		// TODO Auto-generated method stub

	}

}
