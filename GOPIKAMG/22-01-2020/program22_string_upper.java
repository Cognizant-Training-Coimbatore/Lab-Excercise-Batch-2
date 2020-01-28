import java.util.Scanner;
public class program22_string_upper {

	public static void main(String[] args)
	{
	System.out.println("Enter the string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String struppercase=str.toUpperCase();
	System.out.println(str+"has changed to "+struppercase+ "and the length of the string is"+str.length());

	}

}
