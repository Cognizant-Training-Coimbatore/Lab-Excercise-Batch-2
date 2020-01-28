import java.util.Scanner;

public class example6_input 
	{

	public static void main(String[] args) 
	{
		int num, square;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		num = scanner.nextInt();
		square= num*num;
		System.out.println("The square of the number is:  "+ square);

	}

}
