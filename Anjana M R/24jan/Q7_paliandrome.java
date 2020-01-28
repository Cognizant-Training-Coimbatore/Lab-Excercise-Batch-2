import java.util.Scanner;
class paliandrome
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
		if(j==s)
		{
			System.out.println("paliandrome");
		}
		else
		{
			System.out.println("not paliandrome");
		}
	}
}
public class Q7_paliandrome {

	public static void main(String[] args) {
		
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter string");
			String st=sc.nextLine();
			revstring obj=new revstring();
			obj.display(st);
			
		
		
		

	}

}
