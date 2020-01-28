import java.util.Scanner;

public class progrem010_capital_string {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Name");
	String str= sc.nextLine();
	String p;
	p = str.toUpperCase();
	System.out.println(" Name :"+p);
	
	int x= str.length();
	System.out.println(" length "+x);
	
	}

}
