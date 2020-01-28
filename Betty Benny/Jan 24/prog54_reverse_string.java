import java.util.Scanner;

public class prog54_reverse_string
{

	public static void main(String[] args) 
	{
		String s1,rev=" ";
		int l;
		
		System.out.println("Enter a string");
		Scanner scanner=new Scanner(System.in);
		s1=scanner.nextLine();
		l=s1.length();
		for(int i=l-1;i>=0;i--)
			rev=rev+s1.charAt(i);
		System.out.println("reverse= " +rev);
		
		// TODO Auto-generated method stub

	}

}
