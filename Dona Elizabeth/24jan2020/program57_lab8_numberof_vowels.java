import java.util.Scanner;
import java.lang.*;

class vow
{
	String str;
	void vowelCount(String str)
	{
		int len=str.length();
		int count=0,i;
		for(i=0;i<len;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
				
			}
			
		}
		System.out.println("The count of vowels is : "+count);
	}
}
public class program57_lab8_numberof_vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String a=sc.nextLine();
		vow obj=new vow();
		obj.vowelCount(a);

	}

}
