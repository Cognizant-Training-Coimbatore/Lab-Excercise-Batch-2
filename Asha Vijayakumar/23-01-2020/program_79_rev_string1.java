import java.util.Scanner;
public class program_79_rev_string1 
{
		public static void main(String[] args) 
		{
		String orginal,reverse = "";
		int strlen,i;
		System.out.println("Enter a string to reverse:");
		Scanner scanner = new Scanner(System.in);
		orginal = scanner.nextLine();
		strlen = orginal.length();
		System.out.println(strlen);
		for(i=strlen-1;i>=0;i--)
		{
			reverse=reverse+orginal.charAt(i);
			
		}
		System.out.println("Reverse of the string is:" + reverse);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
