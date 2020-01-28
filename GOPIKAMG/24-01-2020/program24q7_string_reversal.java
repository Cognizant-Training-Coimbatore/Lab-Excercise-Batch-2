import java.util.Scanner;
public class program24q7_string_reversal {

	public static void main(String[] args) 
	{
		
	System.out.println("Enter the string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int l=str.length();
	String reverse="";
	for(int i=l-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	System.out.println("Reversed string is " +reverse);
	

	}

}
