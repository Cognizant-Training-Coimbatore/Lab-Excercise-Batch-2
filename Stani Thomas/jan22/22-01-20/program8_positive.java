import java.util.Scanner;

public class program8_positive {

	public static void main(String[] args)
	{
		int n;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("number is positive");
			}
		else
			System.out.println("number is negative");

}
}