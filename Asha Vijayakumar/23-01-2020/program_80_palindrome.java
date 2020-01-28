import java.util.Scanner;
public class program_80_palindrome 
{

	public static void main(String[] args) 
	{
		String st,nst="";
		System.out.println("Enter a string:");
		Scanner scanner = new Scanner(System.in);
		st = scanner.nextLine();
		int len=st.length();
		for(int i=len-1;i>=0;i--)
		{
			nst=nst+st.charAt(i);
			
		}
		System.out.println("Reverse of the string:"+ nst);
		if(st.equals(nst))
		{
			System.out.println("String is palindrome");
			
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		// TODO Auto-generated method stub

	}

}
