import java.util.Scanner;
class Programming
{
	String name;
	Programming()
	{
		System.out.println("I love programming language");
	}
	Programming(String name)
	{
		System.out.println("I love " +name);
		
	}
}
public class question8 {

	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter string");
		String a=input.nextLine();
		int num=a.length();
		if (num==0)
		{
			Programming obj1 =new Programming();
		}
		else
		{
			Programming obj =new Programming(a);
		}
		input.close();
	}

}
