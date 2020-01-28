import java.util.Scanner;

class stringhandler
{
	String str;
	
	
	int len()
	{	
		int n=str.length();
		return n;
	}
	
	void lower()
	{
		String s =str.toLowerCase();
		System.out.println("new string is : "+s);
	}
}
public class prog38 {

	public static void main(String[] args) 
	{	
		
		stringhandler obj =  new stringhandler();
		Scanner sc = new Scanner(System.in);
		obj.str = sc.next();
		System.out.println("Length : "+obj.len());
		obj.lower();
		
	}

}
