import java.util.Scanner;

public class question8_vowels_in_string {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str="";
		int count = 0;
		
		System.out.println("Enter the string:");
		str=sc.nextLine();
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				count+=1;
			}
		}
		System.out.println("The number of vowels in the string :" +count);
		
	}
}
