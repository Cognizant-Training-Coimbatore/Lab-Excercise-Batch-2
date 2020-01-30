import java.util.Scanner;

class pali
{
	String str;
	void palindrome(String str)
	{
		//String str3=str;
		String str2="";
		int i;
		int len=str.length();
		for(i=len-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}
		if(str.equals(str2))
		{
			System.out.println("The entered string is palindrome");
		}
		else
		{
			System.out.println("The entered string is not palindrome");
		}
	}
}
public class program59_lab10_palindrome {

	public static void main(String[] args) {
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		a=sc.nextLine();
		pali obj=new pali();
		obj.palindrome(a);
	}

}
