import java.util.Scanner;

public class program_79_no_of_vowels
{

	public static void main(String[] args) 
	{
		String str;
		int count=0;
		
		System.out.println("Enter the string:");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
			{
				count++ ;
			}
			
		}
		System.out.println(count);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
