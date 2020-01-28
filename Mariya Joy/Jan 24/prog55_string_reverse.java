import java.util.Scanner;

public class prog55_string_reverse {

	public static void main(String[] args) {
		String str,rev=" ";
		int l,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		str=s.nextLine();
		l=str.length();
		for(i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
			
		System.out.println("The reverse of string is "+rev);
		
			
		
		// TODO Auto-generated method stub

	}

}
