import java.util.Scanner;

class fifth
{
	void length(String str)
	{
		int count=str.length();
		System.out.println(count);
	}
	void tolower(String str)
	{
		String strnew = str.toLowerCase();
		System.out.println(strnew);
	}
}
public class q5 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string to count the chracters:");
		String str = sc.nextLine();
		System.out.println("enter the string to convert to uppercase:");
		String str1 = sc.nextLine();
		fifth obj=new fifth();
		obj.length(str);
		obj.tolower(str1);
	}

}
