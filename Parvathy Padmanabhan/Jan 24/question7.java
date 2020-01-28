import java.util.Scanner;
class stringrev
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
public class question7 
{

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		stringrev obj= new stringrev();
		System.out.println("Enter the string");
		String a = input.nextLine();
		String b= obj.reverse(a);
		System.out.println(b);
		input.close();
	}
}
