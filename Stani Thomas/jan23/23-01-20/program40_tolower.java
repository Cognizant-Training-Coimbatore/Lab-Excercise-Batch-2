import java.util.Scanner;

class tolow
{
	void len(String str)
	{
		int l=str.length();
		System.out.println("length = "+l);
	}
	void low(String str)
	{
		String str1=str.toLowerCase();
		System.out.println(str1);
	}
}
public class program40_tolower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str2=sc.nextLine();
tolow obj=new tolow();
obj.len(str2);
obj.low(str2);
	}

}
