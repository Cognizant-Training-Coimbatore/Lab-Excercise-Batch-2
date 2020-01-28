import java.util.Scanner;

class Strings
{

	void length(String str)
	{
		System.out.println("The length of the string "+(str.length()));
	}
}
public class programq5_string {

	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String strng=sc.nextLine();
		Strings obj=new Strings();
		obj.length(strng);
   
	}

}
