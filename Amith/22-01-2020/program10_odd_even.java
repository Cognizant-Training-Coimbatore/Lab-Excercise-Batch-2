import java.util.Scanner;

public class program10_odd_even {

	public static void main(String[] args) 
	{
		int x;
		System.out.println("enter your number");
		Scanner scanner = new Scanner(System.in);
		x=scanner.nextInt();
		if(x%2==0)
		{
			System.out.println("number IS EVEN");
		}
		else
		{
			System.out.println("number is odd");
		}
	}

}
