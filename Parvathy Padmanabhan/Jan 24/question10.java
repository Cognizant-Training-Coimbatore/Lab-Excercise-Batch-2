import java.util.Scanner;
class stringmanipulation
{
	String reverse( String a)
	{
		String b="";
		for(int i=a.length() -1 ; i>=0; i--)
		{
			b = b + a.charAt(i);
		}
		return b;
	}
}
public class question10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		stringmanipulation obj= new stringmanipulation();
		System.out.println("Enter the string");
		String a = input.nextLine();
		String b= obj.reverse(a);
		System.out.println(b);
		if(a.contentEquals(b))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		input.close();
	}

}
