import java.util.Scanner;

public class example9_display_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		x = sc.nextInt();
		y=x*x;
		System.out.println("Square: " + y);
	}

}
