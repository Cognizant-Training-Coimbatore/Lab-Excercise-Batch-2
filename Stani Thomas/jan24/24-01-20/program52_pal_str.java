import java.util.Scanner;

public class program52_pal_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2="";
		int i,l;
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		l=str1.length();
		for(i=l-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		if(str1.equals(str2))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}

}
