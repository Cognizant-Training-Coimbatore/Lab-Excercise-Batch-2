import java.util.Scanner;

public class example6_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		x = sc.nextInt();
		if(x%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}

}
