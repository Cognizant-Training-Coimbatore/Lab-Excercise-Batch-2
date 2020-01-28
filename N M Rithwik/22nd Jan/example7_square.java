import java.util.Scanner;

public class example7_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		x = sc.nextInt();
		y = sc.nextInt();
		ans = (x*x)+(2*x*y)+(y*y);
		System.out.println("The square of sum of the numbers is : " + ans);
	}

}
