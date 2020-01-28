import java.util.Scanner;

public class program_vowels {

	public static void main(String[] args)
	{
		int count=0;
		String s;
		System.out.println("Enter the string");
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);

}
}
