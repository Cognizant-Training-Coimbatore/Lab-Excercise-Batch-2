import java.util.Scanner;

public class Program_83 {

	public static void main(String[] args) {
		String s;
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.next();
		l=s.length();
		if(l!=0)
		{
			System.out.println(l);
		}
		else
		{
			throw new NullPointerException("Invalid entry");
		}

	}

}
