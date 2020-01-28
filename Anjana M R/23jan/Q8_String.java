import java.util.Scanner;
class programming
{
	String s;
	programming()
	{
		System.out.println("I love programming languages");
	}
	programming(String n)
	{
		s=n;
		System.out.println("String="+s);
	}
}
public class Q8_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st;
		System.out.println("Enter the string");
		st=sc.nextLine();
		int a=st.length();
		if(a!=0)
		{
			programming obj1=new programming(st);
		}
		else
		{
			programming obj2=new programming();
		}
			
	}

}
