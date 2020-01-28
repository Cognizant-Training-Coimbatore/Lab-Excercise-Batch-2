import java.util.Scanner;

class strs
{
	void length(String s)
	{
		int l=s.length();
		System.out.println("length is "+l);
	}
	void lower(String s)
	{
		System.out.println(s.toLowerCase());
	}
}
public class question5 {

	public static void main(String[] args) 
	{
	System.out.println("enter the string");	
	Scanner sc = new Scanner(System.in);
	String n=sc.nextLine();
	strs obj= new strs();
	obj.length(n);
	obj.lower(n);

	}

}
