import java.util.Scanner;

public class String_exception {

	public static void main(String[] args) 
	{
		String s;
		int count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		s=in.nextLine();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			char ch =s.charAt(i);
			count++;
			
		}
		if(count>0)
		{
			System.out.println("The count is:" +count);
		}
		else if(count==0)
		
			throw new NullPointerException("Error..The string is null");
		
		

	}

}
