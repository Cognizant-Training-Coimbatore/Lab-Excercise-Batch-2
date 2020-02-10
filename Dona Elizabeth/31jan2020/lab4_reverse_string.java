import java.util.Scanner;

class rev
{
	String str;
	void display(String str)
	{
		int len=str.length();
		int j=len-1;
		int i;
		String rev="";
		for(i=j;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("The reversed string : ");
		System.out.println(rev);
	}
}
public class lab4_reverse_string {

	public static void main(String[] args) {
		rev obj=new rev();
		System.out.println("Enter the string");
		String str1;
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		obj.display(str1);
	}

}
