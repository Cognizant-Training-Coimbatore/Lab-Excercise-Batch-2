import java.util.Scanner;

class strings
{
	void length(String str)
	{
		int c=str.length();
		System.out.println(c);
	}
	void lower(String str)
	{
		String strr=str.toLowerCase();
		System.out.println(strr);
	}
}
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		strings obj=new strings();
		obj.length(str1);
		obj.lower(str1);
		
		
	}

}
