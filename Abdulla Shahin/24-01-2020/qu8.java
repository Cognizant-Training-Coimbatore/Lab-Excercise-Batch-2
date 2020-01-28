import java.util.Scanner;

public class qu8 {

	public static void main(String[] args)
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || 
					str.charAt(i)=='o' || str.charAt(i)=='u' )
			{
				count=count+1;
			}

		}
		System.out.println("the no. of vowels:"+count);
		
	}

}
