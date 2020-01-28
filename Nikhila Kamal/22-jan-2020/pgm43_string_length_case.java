import java.util.Scanner;

class stroperns
{
	void display(String str)
	{
		int len=str.length();
		System.out.println("length of string:" + len);
	}
	void display1(String s)
	{
		String st=s.toLowerCase();
		System.out.println("string to lowercase: " + st);
	}
}
public class pgm43_string_length_case {

	public static void main(String[] args) {
		stroperns obj=new stroperns();
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String strn=sc.nextLine();
		obj.display(strn);
		System.out.println("enter other string");
		Scanner s=new Scanner(System.in);
		String strin=s.nextLine();
		
		
		obj.display1(strin);
	}

}
