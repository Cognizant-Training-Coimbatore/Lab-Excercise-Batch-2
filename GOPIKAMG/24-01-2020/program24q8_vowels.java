import java.util.Scanner;
public class program24q8_vowels {

	public static void main(String[] args) 
	{
	int	count=0;
	System.out.println("Enter the string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int l=str.length();
	for(int i=0;i<l;i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
			     count++;
				}
	}
System.out.println("No of vowels is "+count);
	}

}
