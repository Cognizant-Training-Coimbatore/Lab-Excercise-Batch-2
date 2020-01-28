import java.util.Scanner;

public class example4_pos_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		x = sc.nextInt();
		if(x<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is positive");
		}
	}

}
