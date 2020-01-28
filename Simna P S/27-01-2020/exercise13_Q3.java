import java.util.Scanner;

public class exercise13_Q3 
{

	public static void main(String[] args) 
	{
		String word;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		word = scanner.nextLine();
		n = word.length();
		if(n==0)
		{
			throw new NullPointerException("invalid entry");
		}
		else
			System.out.println("the number of characters: "+n);

	}

}
