
import java.util.Scanner;

class Stringhandler
{
	void len(String a)
	
	{
		System.out.println("Length=" +a.length());	
	}
	void low(String a)
	{
		String c;
		c=a.toLowerCase();
		System.out.println("New string=" +c);
	}
	}

public class a5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x;
		Stringhandler ob=new Stringhandler();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		x=sc.nextLine();
		ob.len(x);
		ob.low(x);
		
		
		
		

	}

}
