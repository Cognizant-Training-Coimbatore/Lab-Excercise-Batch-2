import java.util.Scanner;

public class Program4_read_from_keyboard {

	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter the value for x");
		Scanner scanner = new Scanner(System.in);
		x=scanner.nextInt();
		System.out.println("The value of x is " + x);
	}
}
