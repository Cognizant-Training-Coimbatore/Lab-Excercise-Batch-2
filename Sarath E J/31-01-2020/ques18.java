package jan31;

import java.util.Scanner;

public class ques18 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==b && a == c)
		{
			System.out.println("All are equal");
		}
		else if(a != b && a !=c )
		{
			System.out.println("Neither all are equal and nor same");
		}
		else if(a != c && a !=c )
		{
			System.out.println("Neither all are equal and nor same");
		}

	}

}
