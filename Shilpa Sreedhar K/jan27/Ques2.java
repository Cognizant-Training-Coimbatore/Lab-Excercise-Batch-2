import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {

		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first num");
		a=sc.nextInt();
		System.out.println("enter second num");
		b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println(c);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}