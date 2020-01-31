import java.util.Scanner;

public class program4_reverse_string {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s;
	String reverse="";
	System.out.println("Enter the string");
	s=sc.nextLine();
	int l=s.length();
	for(int i=l-1;i>=0;i--)
	{
		reverse=reverse+s.charAt(i);
	}
	
System.out.println("reverse of the string  :"+reverse);
	}

}
