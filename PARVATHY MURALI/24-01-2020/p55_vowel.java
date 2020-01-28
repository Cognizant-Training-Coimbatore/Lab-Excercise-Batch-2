import java.util.Scanner;

public class p55_vowel 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter string: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();
		int c=0;
		for(int i=0;i<l;i++)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				c++;
			}
				
		}System.out.println("No: of vowels in "+str+" is "+c);

	}

}
