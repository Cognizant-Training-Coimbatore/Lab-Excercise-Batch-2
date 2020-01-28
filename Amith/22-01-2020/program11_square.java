import java.util.Scanner;

public class program11_square {

	public static void main(String[] args)
	{
		int x,y,ans;
		System.out.println("enter first  number");
		Scanner scanner = new Scanner(System.in);
		x=scanner.nextInt();
		System.out.println("enter second  number");
		y=scanner.nextInt();
		ans=(x+y)*(x+y);
		System.out.println("answer is"+ans);
	}

}
