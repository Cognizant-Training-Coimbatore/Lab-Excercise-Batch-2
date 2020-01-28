import java.util.Scanner;
class revstring
{
	
	void display(String a)
	{
		String s="";
		for(int i=a.length()-1;i>=0;i--)
		{
			s=s+a.charAt(i);
		}
		System.out.println("reverse string");
		System.out.println(s);
	}
}
public class reverse_string_Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String st=sc.nextLine();
		revstring obj=new revstring();
		obj.display(st);
		
		

	}

}
