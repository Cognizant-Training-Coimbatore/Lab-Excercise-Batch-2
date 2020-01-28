
import java.util.Scanner;

class vowels
{
	String str;
	int count = 0;
	vowels()
	{
		
		Scanner sc = new Scanner(System.in);
		
		str = sc.next();
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
			{
				count++;

			}
			
		}
		dis();
	}
	void dis() 
		{
			System.out.println("No of vowels="+count);
		}
	
	
}
public class program45 {

	public static void main(String[] args) 
	{
		
		vowels ob = new vowels();
		
		

	}

}
