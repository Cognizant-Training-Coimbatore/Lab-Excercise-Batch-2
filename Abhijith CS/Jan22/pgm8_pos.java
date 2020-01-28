import java.util.Scanner;

public class pgm8_pos {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		if (num >= 0)
		{
			System.out.println("Positive number or Zero");
		}
		else
		{
			System.out.println("Negative number");
		}
	}

}
