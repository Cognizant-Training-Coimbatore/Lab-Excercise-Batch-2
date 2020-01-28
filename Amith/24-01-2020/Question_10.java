import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args)
	{
		String str;
		System.out.println(" enter your string");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		int i=0;
		int j=str.length()-1;
		int count=0;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
			count=2;
			}
			else
			{
				count=1;
			}
			i++;
			j--;
		}
		if (count==2)
		{
			System.out.println("not a palindrom");
		}
		if( count==1)
		{
			System.out.println("palindrome");
		}
		
		
	}

}
