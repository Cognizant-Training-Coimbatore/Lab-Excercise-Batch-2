import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) 
	{
		String str;
		int count=0;
		System.out.println(" enter your string");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		for(int j=0;j<str.length();j++)
		{
			char k=str.charAt(j);
			if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u')
			{
				
			count++;
				
			}
		}
		System.out.println(" no of vowel "+count);
	}
    
}
