import java.util.Scanner;

class string_method
{
	void leng(String str)
	{
		System.out.println("Length of the string : "+str.length());
	}
	void lower (String str)
	{
		System.out.println("Lower case result :"+str.toLowerCase());
	}
}
public class pgm39_stringmethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		string_method sm = new string_method();
		System.out.println("Enter a string: ");
		String st = sc.nextLine();
		sm.leng(st);
		sm.lower(st);
	}

}
