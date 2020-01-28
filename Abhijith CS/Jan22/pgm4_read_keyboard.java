import java.util.Scanner;

public class pgm4_read_keyboard {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter the value for x: ");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		System.out.println("value for x: "+x);
	}

}
