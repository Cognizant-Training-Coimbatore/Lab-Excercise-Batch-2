import java.util.Scanner;

public class program22_upper {

	public static void main(String[] args) 
	{
			String a;
			Scanner sc = new Scanner(System.in);
			 a=sc.next();
					
			int n= a.length();
			String s= a.toUpperCase();
			System.out.println("length = "+n);
			System.out.println("new string is "+s);

	}

}

