import java.util.Scanner;

public class program25_string_uppercase_length 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String struppercase=str.toUpperCase();
		System.out.println("After converting to uppercase,"+str+" becomes "+struppercase);
		System.out.println("The length of "+str+"is "+(struppercase.length()));

	}

}
