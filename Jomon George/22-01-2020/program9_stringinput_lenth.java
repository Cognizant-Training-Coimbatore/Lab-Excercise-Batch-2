import java.util.Scanner;

public class program9_stringinput_lenth 
{

	public static void main(String args[]) 
	{
			System.out.println("Enter the string:");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			System.out.println("The length of "+str+"is "+(str.length()));
			
	}

}
