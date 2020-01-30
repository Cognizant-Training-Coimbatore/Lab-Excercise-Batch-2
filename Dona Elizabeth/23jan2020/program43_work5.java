import java.util.Scanner;

class str_methods
{
	String str1;
	void method1(String str)
	{
		int a=str.length();
		System.out.println("The lenght of the string is "+a);
	}
	void method2(String str)
	{
		String s=str.toLowerCase();
		System.out.println("String converted to lowercase: "+s);
	}
}
public class program43_work5 {

	public static void main(String[] args) {
		str_methods obj=new str_methods();
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		obj.method1(s1);
		obj.method2(s1);
	}

}
