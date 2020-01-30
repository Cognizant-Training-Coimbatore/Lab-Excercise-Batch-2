import java.util.Scanner;

class str
{
	String str1;
	void reverse(String str1)
	{
		String str2="";
		int i;
		int len=str1.length();
		for(i=len;i>0;i--)
		{
			str2=str2+str1.charAt(i-1);
		}
		System.out.println("The reversed string is: ");
		System.out.println(str2);
	}
}
public class program56_lab7_reverse_string {

	public static void main(String[] args) {
		str obj=new str();
		String a;
		System.out.println("Enter the string to reverse");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		obj.reverse(a);
	}

}
