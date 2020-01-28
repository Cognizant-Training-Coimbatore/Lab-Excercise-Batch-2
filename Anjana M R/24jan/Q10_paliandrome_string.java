import java.util.Scanner;

class paliandromee
{
	String j;
	void display(String a)
	{
		j=a;
		String s="";
		for(int i=a.length()-1;i>=0;i--)
		{
			s=s+a.charAt(i);
		}
		System.out.println("reverse string");
		System.out.println(s);
		if(j.contentEquals(s))
		{
			System.out.println("paliandrome");
		}
		else
		{
			System.out.println("not paliandrome");
		}
	}
}
public class Q10_paliandrome_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String st=sc.nextLine();
		paliandromee obj=new paliandromee();
		obj.display(st);
		
	}

}
