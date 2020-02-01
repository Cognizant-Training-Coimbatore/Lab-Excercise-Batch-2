import java.util.Scanner;

public class program_lstset_3q_nuber_of_char
{

	public static void main(String[] args) 
	{
		int count=0,i,len;
		String ch;
		System.out.println("Enter a string:");
		Scanner scanner = new Scanner(System.in);
		ch = scanner.nextLine();
		len=ch.length();
		System.out.println( + len);
	
		if (len==0)
			{
				throw new NullPointerException("Check the string that you given");
			}
			
			
		
		
		// TODO Auto-generated metod stub

	}

}
